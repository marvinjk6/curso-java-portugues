package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

	
public class Exercicio {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			double largura, comprimento, metroQuadrado, area, preco;
			
			largura = sc.nextDouble();
			comprimento = sc.nextDouble();
			metroQuadrado = sc.nextDouble();
			area = largura * comprimento;
			preco = area * metroQuadrado;

			System.out.printf("Area do terreno: %.2f%n", area);
			System.out.printf("Preço do terreno: %.2f%n", preco);

			sc.close();
		
		}
	}

