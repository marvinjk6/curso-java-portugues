package exercicios;

import java.util.Scanner;

public class Exercicio03 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não são  Múltiplos");
		}

		sc.close();
	}
}
