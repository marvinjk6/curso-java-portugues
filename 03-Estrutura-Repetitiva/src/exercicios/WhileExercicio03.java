package exercicios;

import java.util.Scanner;

public class WhileExercicio03 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int gasolina = 0;
		int diesel = 0;
		int alcool = 0;
		
		while(codigo != 4 || codigo < 4) {
			
			if(codigo == 1) {
				alcool += 1;
				codigo = sc.nextInt();
			}
			if(codigo == 2) {
				gasolina += 1;
				codigo = sc.nextInt();

			}
			if(codigo == 3) {
				diesel += 1;
				codigo = sc.nextInt();

			}
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		
		sc.close();
	}
}
