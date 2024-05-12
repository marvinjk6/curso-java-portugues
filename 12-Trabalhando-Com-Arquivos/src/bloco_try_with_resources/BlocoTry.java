package bloco_try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTry {

	public static void main(String[] args) {
		/* 
		 * É um bloco try que declara um ou mais recursos, e garante que esses
		recursos serão fechados ao final do bloco 
		*/

		String path = "C:\\Users\\Marvin Tavares\\Documents\\Java\\14-trabalhando-com-arquivos\\teste.txt";

		// Instanciaras streams no bloco try
		try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {
			String line = br.readLine(); // vai ler o arquivo e no final retorna null
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}

}
