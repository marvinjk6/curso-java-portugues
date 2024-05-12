package heranca_polimorfismo_exercicio_fixacao2;

public class Individual extends TaxesPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double taxesPaid() {
		double taxes = 0.0;
		if(getAnualIncome() < 20000.0) {
			taxes = getAnualIncome() * 0.15 - healthExpenditures * 0.5;
			//return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			taxes = (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
			//return getAnualIncome() * 0.25 - healthExpenditures * 0.5;

		}
		return taxes;
	}
	
	
}
