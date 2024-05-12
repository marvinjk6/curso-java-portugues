package fileReader_e_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// File Reader stream de leitura de caracteres a partir de arquivos
		// stream significa sequencia em programação

		String path = "C:\\Users\\Marvin Tavares\\Documents\\Java\\14-trabalhando-com-arquivos\\teste2.txt";
		
		// nessa aula será feito o processo manual 
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // instanciado a partir do FileReader
			
			String line = br.readLine(); // vai ler o arquivo e no final retorna null
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try { 
				if (br != null) {
				br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}

}
