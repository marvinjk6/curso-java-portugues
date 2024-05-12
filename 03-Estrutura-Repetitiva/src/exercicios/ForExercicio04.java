package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ForExercicio04 {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			
			if(b == 0) {
				System.out.println("Divisão impossivel");
			} 
			else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}

		}

		sc.close();
	}


}
