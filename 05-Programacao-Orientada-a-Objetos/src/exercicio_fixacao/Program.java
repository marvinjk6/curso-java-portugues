package exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.price = sc.nextDouble();
		
		System.out.print("How Many dollars will be bought? ");
		CurrencyConverter.dollarQuantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.dollarConverted());;
		
		
		sc.close();
	}

}
