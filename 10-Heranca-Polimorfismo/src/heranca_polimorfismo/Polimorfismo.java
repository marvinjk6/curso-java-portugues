package heranca_polimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account x = new Account(1001, "Fernanda", 1000.0);
		Account y = new SavingsAccount(1002, "Gabriela", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
