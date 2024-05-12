package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaChamadaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();

		System.out.println("End of the program");

	}

	public static void method1() {
		System.out.println("*------- Method1 START ----------*");
		method2();
		System.out.println("*------- Method1 END ----------*");

	}

	public static void method2() {
		System.out.println("*------- Method2 START ----------*");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Escreva nomes ou numeros separados por espaço: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Escolha uma posição (0 traz o primeiro nome/numero:): ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!!");
			e.printStackTrace(); // Stack trace mostra a chamada de métodos que acarretou na exceção
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input  Error!!");
		}

		sc.close();
		System.out.println("*------- Method2 END ----------*");

	}

}
