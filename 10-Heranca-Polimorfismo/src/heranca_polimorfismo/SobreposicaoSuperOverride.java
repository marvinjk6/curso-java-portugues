package heranca_polimorfismo;

public class SobreposicaoSuperOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account(1001, "Mike", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());

		Account acc3 = new BusinessAccount(1003, "Jean", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
