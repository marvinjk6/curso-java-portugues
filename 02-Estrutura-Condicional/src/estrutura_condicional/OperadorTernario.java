package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco <= 34.0) ? preco * 0.05 : preco * 0.1;
		double precoFinal = preco - desconto;
		
		System.out.printf("O desconto foi de: R$ %.2f%n", desconto);
		System.out.printf("Preço Final: R$ %.2f%n", precoFinal);
		
		sc.close();
	}

}