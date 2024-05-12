package lendo_arquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {

	public static void main(String[] args) {
		
		// Imprimir os dados de um arquivo
		

		File file = new File("C:\\Users\\Marvin Tavares\\Documents\\Java\\12-git-github\\1-primeiro_projeto.txt");
		Scanner sc = null;
		// precisa colocar o Scanner dentro de um try porque ele vai tentar abrir o arqruivo
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		/* boa pratica colocar o fechamento no finally, 
		pois o recurso será fechado de qualquer maneira*/
		finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
