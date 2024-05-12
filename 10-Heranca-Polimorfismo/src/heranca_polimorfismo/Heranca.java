package heranca_polimorfismo;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Type your account number: ");
		int number = sc.nextInt();
		System.out.print("Say your name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("How much money there are in your account: ");
		double balance = sc.nextDouble();
		
		Account account = new Account(number, holder, balance);
		
		System.out.println();
		System.out.println(account);
		
		System.out.print("Do you want a Business Account (y/n)? ");
		double answer = sc.next().charAt(0);
		if(answer == 'y') {
			int businessAccountNumber = random.nextInt(10000000);
			String businessAccountName = holder;
			double businessAcountBalance = 0.0;
			System.out.print("Do you want a loan (y/n)? ");
			char answerLoan = sc.next().charAt(0);
			double limitLoan = 5000.0;
			if(answerLoan == 'y') {
				BusinessAccount business = new BusinessAccount(businessAccountNumber, businessAccountName, businessAcountBalance, limitLoan);
				System.out.print("How much money do you need? ");
				double amount = sc.nextDouble();
				while(amount > limitLoan) {
					System.out.println("You can't take a loan with this amount, your limit is $" + limitLoan);	
					System.out.print("Say the amount: $");
					amount = sc.nextDouble();
				} 
				business.loan(amount);
				System.out.println(business);
			} 
			else {
			BusinessAccount business = new BusinessAccount(businessAccountNumber, businessAccountName, businessAcountBalance, limitLoan);
			System.out.println(business);
			}

		}
		sc.close();
	}

}
