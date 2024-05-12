package exercicios;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		String valor;
		
		if(numero % 2 == 0) {
			valor = "Número Par";
		} 
		else {
			valor = "Número Ímpar";
		}
		
		System.out.println(valor);
		
		sc.close();
	}
}
