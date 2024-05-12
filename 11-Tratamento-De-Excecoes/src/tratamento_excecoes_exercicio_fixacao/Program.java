package tratamento_excecoes_exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados da conta: ");
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Digite o valor do saque: ");
		double amount = sc.nextDouble();
	
		try {
			account.withdraw(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", account.getBalance()));
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
