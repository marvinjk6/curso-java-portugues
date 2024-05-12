package problema_exemplo_sem_oo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y");
		
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();

		double pX = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.printf("Triangle X area = %.2f%n", areaX);
		System.out.printf("Triangle Y area = %.2f%n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");

		}
		
		sc.close();
	}

}
