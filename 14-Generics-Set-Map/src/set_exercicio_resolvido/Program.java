package set_exercicio_resolvido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// esse problema quer saber quantos usuários acessaram o log
		// como o set não aceita repetição de dados, ele é adequado para resolver
		// esse problema
		
		// C:\Users\Marvin Tavares\Documents\Java\16-generics-set-map
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String usarname = fields[0];
				Instant moment = Instant.parse(fields[1]);
				set.add(new LogEntry(usarname, moment));
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
