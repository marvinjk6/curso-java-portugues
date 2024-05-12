package heranca_polimorfismo;

// o final class impede que SavingsAccount seja herdada pro outra classe
public final class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	// Override indica que o método foi sobreposto
    // final indica que o método não pode ser sobreposto
	@Override 	
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}
