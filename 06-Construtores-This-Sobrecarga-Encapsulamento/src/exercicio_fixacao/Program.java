package exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		
		System.out.print("Enter Account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter Account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Enter an initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta(number, holder, initialDeposit);
		}
		else {
			account = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated data: ");
		System.out.println(account);
		
		sc.close();

	}

}
