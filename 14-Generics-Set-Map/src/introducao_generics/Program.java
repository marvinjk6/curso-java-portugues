package introducao_generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// o uso comum dos generics é em coleções (listas)
		
		/* PrintService é genérico,
		 * Então na hora de instanciar passar o tipo, nesse caso foi Integer 
		 */
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		/*
		 *  o type safety do generics não permite adicionar String 
		sendo que a lista é de Integer - ps.addValue("Maria");
		*/
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();

	}

}
