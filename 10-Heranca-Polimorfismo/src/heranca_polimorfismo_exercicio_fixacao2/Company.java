package heranca_polimorfismo_exercicio_fixacao2;

public class Company extends TaxesPayer {

	private Integer numberEmployees;
	
	Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
	
	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxesPaid() {
		double taxes = 0.0;
		if(numberEmployees < 10) {
			taxes = getAnualIncome() * 0.16;
			// 	return getAnualIncome() * 0.16;
		} else {
			taxes = getAnualIncome() * 0.14;
			// return getAnualIncome() * 0.14;
		}
		return taxes;
	}
}
