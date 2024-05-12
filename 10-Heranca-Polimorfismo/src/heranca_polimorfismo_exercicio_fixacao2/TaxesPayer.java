package heranca_polimorfismo_exercicio_fixacao2;

public abstract class TaxesPayer {

	private String name;
	private Double anualIncome;
	
	TaxesPayer() {
	}

	public TaxesPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double taxesPaid();
}
