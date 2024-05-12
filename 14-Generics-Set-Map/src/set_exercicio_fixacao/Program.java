package set_exercicio_fixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n1 = sc.nextInt();
		
		for(int i = 1; i <= n1; i++) {
			int student = sc.nextInt();
			a.add(student);
		}
		
		System.out.print("How many students for course B? ");
		int n2 = sc.nextInt();
		
		for(int i = 1; i <= n2; i++) {
			int student = sc.nextInt();
			b.add(student);
		}
		
		System.out.print("How many students for course C? ");
		int n3 = sc.nextInt();
		
		for(int i = 1; i <= n3; i++) {
			int student = sc.nextInt();
			c.add(student);
		}
		
		Set<Integer> half = new HashSet<>(a);
		half.addAll(b);
		
		Set<Integer> alex = new HashSet<>(half);
		alex.addAll(c);
		
		System.out.println("Total students: " + alex.size());
		
		sc.close();

	}

}
