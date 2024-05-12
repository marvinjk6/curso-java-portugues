package manipulando_pastas;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); 
		
		// pegar as pastas do diretório
		System.out.println();
		System.out.println("FOLDERS:");
		File[] folders = path.listFiles(File::isDirectory);
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// pegar os arquivos do diretorio
		System.out.println();
		System.out.println("FILES:");
		File[] files = path.listFiles(File::isFile);
		for(File file: files) {
			System.out.println(file);
		}
		
		// criar uma subpasta da pasta java
		boolean success = new File(strPath + "\\subpasta").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
		
	}

}
