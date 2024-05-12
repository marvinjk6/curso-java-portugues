package exercicio_fixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// Path: C:\Users\Marvin Tavares\Documents\Java\17-programacao-funcional-expressoes-lambda
		// funcionarios.txt
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: R$ ");
		double baseSalary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> email = list.stream()
					.filter(p -> p.getSalary() >= baseSalary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than"+baseSalary+":");
			
			email.forEach(System.out::println);
			
			double sum = list.stream()
						.filter(p -> p.getName().charAt(0) == 'M')
						.map(p -> p.getSalary())
						.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts whith 'M': " + String.format("%.2f", sum));
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
