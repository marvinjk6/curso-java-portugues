package exercicio02;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee;

		employee = new Employee();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		employee.name = sc.nextLine();

		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee: %s, R$ %.2f%n", employee.name, employee.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.printf("Updated data: " + employee);
		
		sc.close();
	}

}
