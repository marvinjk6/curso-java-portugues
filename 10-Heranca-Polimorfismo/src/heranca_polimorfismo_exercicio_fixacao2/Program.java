package heranca_polimorfismo_exercicio_fixacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxesPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (c/i)? ");
			char type = sc.next().charAt(0);
			while(type != 'i' && type != 'c' ) {
				System.out.print("Please choose a valid option (c/i): ");
				type = sc.next().charAt(0);
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditure));
			}
			else if (type == 'c' ) {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxesPayer taxesPayer : list) {
			System.out.println(taxesPayer.getName() + ": $ " +String.format("%.2f", taxesPayer.taxesPaid()) );
		}
		
		double sum = 0.0; 
		System.out.println();
		for(TaxesPayer taxesPayer : list) {
			sum += taxesPayer.taxesPaid();
		}
		System.out.printf("TOTAL TAXES: %.2f", sum);
		
		sc.close();
	}

}
