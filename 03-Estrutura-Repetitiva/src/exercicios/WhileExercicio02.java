package exercicios;

import java.util.Scanner;

public class WhileExercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		while(x != 0 || y != 0) {
			if(x > 0  && y > 0) {
				System.out.println("Q1");
				x = sc.nextInt();
				y = sc.nextInt();
			} 
			else if (x < 0 && y > 0 ) {
				System.out.println("Q2");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x < 0 && y < 0) {
				System.out.println("Q3");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			else if(x > 0 && y < 0) {
				System.out.println("Q4");
				x = sc.nextInt();
				y = sc.nextInt();
			}
		}
		
		sc.close();
	}
}
