package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		raio = sc.nextDouble();
		area = 3.14159 * (raio * raio);
		
		System.out.printf("Area = %.4f%n", area);
		sc.close();

	}
}
