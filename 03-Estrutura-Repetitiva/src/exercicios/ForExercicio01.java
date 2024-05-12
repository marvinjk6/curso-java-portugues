package exercicios;

import java.util.Scanner;

public class ForExercicio01 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("Fim do programa");

		sc.close();
	}

}
