package solucao_problema;

import java.time.Duration;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService  taxService;


	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}



	public Double getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}


	public Double getPricePerHour() {
		return pricePerHour;
	}


	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		// diferença da entres as datas em minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		// dividindo os minutos por 60 para ter a difeneça em horas com a fração de minutos
		double hours = minutes / 60.0;
		
		double basicPayment;
		
		if (hours <= 12.0) {
			 basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
		}
	
}
