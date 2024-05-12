package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		String valor;
		if(numero >= 0) {
			valor = "Positivo";
		} else {
			valor = "Negativo";
		}
		
		System.out.println(valor);
		
		sc.close();
	}
}
