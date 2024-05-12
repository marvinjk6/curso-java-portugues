package heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClassesAbstratas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Sum of all Accounts: $%.2f%n", sum);
		
		
		System.out.println();
		for(Account acc : list) {
			System.out.printf("account: %d, balance: $%.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		System.out.println();
		for(Account acc : list) {
			acc.deposit(10.0);
			System.out.printf("account: %d, Updated balance: $%.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
