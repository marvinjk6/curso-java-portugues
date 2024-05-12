package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Gabriela");
		list.add("Jefferson");
		list.add("Marley");
		list.add(2, "marco");

		System.out.println(list.size());

		for (String nome : list) {
			System.out.println(nome);
		}

		System.out.println("---------------");

		//list.remove("");
		
		// Remove as que começam com M
		list.removeIf(nome -> nome.charAt(0) == 'M');

		for (String nome : list) {
			System.out.println(nome);
		}

		System.out.println("---------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("---------------");

		//criando uma nova lista Apenas nomes que começam com A
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());

		for (String nome : result) {
			System.out.println(nome);
		}

		System.out.println("---------------");
		// Primeiro elemento que começa com A
		String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(name);
	

	}
}
