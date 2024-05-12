package heranca_polimorfismo;

// abstract antes de class, não permite que Account seja instanciada
public class Account {

	//esses atributos estão como protected para que as subclasses herdadas tenham acesso a eles
	protected Integer number;
	protected String holder;
	protected Double balance;
	
	Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	
	protected void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	protected void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account Number: ");
		sb.append(number + "\n");
		sb.append("Holder: ");
		sb.append(holder + "\n");
		sb.append("Balance: $");
		sb.append(String.format("%.2f", balance) + "\n");
		return sb.toString();
	}
}
