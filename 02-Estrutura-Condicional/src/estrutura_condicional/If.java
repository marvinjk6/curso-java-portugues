package estrutura_condicional;

import java.util.Scanner;

public class If {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double horario = sc.nextDouble();
		
		if (horario < 12) {
			System.out.println("Bom dia!!");
		} else if (horario >= 12 && horario < 18) {
			System.out.println("Boa tarde!!");
		
		} else {
			System.out.println("Boa noite!!");
		}
		
		sc.close();
		
	}
}
