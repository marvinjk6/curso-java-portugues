package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {
	
	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//int i;
		//double f;
		//char c;
		
		//x = sc.next();
		//System.out.println("Voce digitou: " + x);
		
		//i = sc.nextInt();
		//System.out.println("O numero é " + i);
		
		//f = sc.nextDouble();
		//System.out.println("O numero é " + f);
		
		//c = sc.next().charAt(0);
		//System.out.println("Você digitou: " + c);

		// ler varios dados
		String a;
		int b;
		double z;
	
		a = sc.next();
		b = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
		
		sc.close();
		
	}

}
