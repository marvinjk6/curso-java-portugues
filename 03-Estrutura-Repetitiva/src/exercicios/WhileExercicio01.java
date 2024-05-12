package exercicios;

import java.util.Scanner;

public class WhileExercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int senhaCorreta = 2002;
		
		while(senha != senhaCorreta) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
