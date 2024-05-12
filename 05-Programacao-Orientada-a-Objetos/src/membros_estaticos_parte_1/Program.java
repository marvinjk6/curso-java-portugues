package membros_estaticos_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; // final usada para constante tudo letra maiuscula

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = circumference(radius);
			
			double v = volume(radius);
			
			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", PI);

			sc.close();
			
		}
		
		// os métodos são estaticos pois uma classe estática(main) só aceita métodos estáticos
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * (radius * radius * radius) / 3;
		}

}
