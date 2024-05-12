package exercicios;

import java.util.Scanner;

public class ForExercicio02 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		int cont1 = 0;
		int cont2 = 0;
		
		for(int i = 1; i <= n; i++) {
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20 ) {
				cont1++;
			} else {
				cont2++;
			}

		}
		
		System.out.println(cont1 + " in"); 
		System.out.println(cont2 +  " out");
		System.out.println("Fim do Programa");

		sc.close();
	}
}
