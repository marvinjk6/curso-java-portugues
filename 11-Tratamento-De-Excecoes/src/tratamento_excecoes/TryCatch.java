package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva nomes separados por espaço: ");
		try {
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Escolha uma posição (0 traz o primeiro nome:): ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// posiçao informada esta além do limite do array
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!!");
		}
		// o position espera um nome e não uma string
		catch(InputMismatchException e) {
			System.out.println("You need to digit a number!!");
		}
		
		System.out.println("End of the program!!");
		
		sc.close();

	}

}
