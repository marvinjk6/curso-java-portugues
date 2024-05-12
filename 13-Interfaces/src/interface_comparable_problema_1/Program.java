package interface_comparable_problema_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "C:\\Users\\Marvin Tavares\\Documents\\Java\\15-interfaces\\nomes.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			// colocar em ordem alfabética
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
