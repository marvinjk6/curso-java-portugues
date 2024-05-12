package heranca_polimorfismo;

// essa classe não poderá ser herdada pois tem o final
public final class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	// esse método não poderá ser herdade
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	public String toString() {
		return "\nBusiness Account: " + number + "\nBusiness Holder: " + holder + "\nBalance Business Account: " + String.format("%.2f", balance);
	}
}
