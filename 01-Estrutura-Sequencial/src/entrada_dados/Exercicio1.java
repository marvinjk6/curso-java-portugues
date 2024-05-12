package entrada_dados;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, soma;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		soma = x + y;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
