package heranca_polimorfismo_exercicio_resolvido1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			if(answer == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} 
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + ", $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
