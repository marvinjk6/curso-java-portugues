package exercicios;

import java.util.Scanner;

public class ForExercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	
		
		for(int i = 1; i<=n; i++) {
			
			int numero = i;
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d%n", numero, quadrado, cubo);	
			
		}
		
		System.out.println("Fim do programa");
		
		sc.close();

	}

}
