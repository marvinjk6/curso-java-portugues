package default_methods;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double amount = sc.nextDouble();
		System.out.print("Meses: ");
		int months = sc.nextInt();
		System.out.println("Pagamento depois de " + months + " meses:");
		
		// or UsaIntertestService(1.0)
		InterestService bis = new BrazilIntertestService(2.0);
		double payment = bis.payment(amount, months);
		
		System.out.println("R$ " + String.format("%.2f", payment));
		
		sc.close();

	}

}
