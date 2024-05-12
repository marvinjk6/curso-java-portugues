package membros_estaticos_parte_2;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/* como os membros da classe calculator2 não são estáticos
		 * é preciso instanciar a Classe calculator 
		 */
		Calculator2 calc = new Calculator2();

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();
	}

}
