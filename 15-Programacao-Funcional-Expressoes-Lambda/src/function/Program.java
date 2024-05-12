package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/* 
		 * Fazer um programa que, a partir de uma lista de produtos, gere uma
		 * nova lista contendo os nomes dos produtos em caixa alta.
		 */
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// pega uma lista, troca para uma stream, usa a função map que funciona para stream
		// depois passa a função como argumento de map
		// depois transforma o stream em lista com collect(Collectors.toList()).
		
		// implementação usando interface
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		// implementação usando expressão lambda declarada
		//Function<Product, String> function = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(function).collect(Collectors.toList());

		// implementação usando expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		// foi criada uma nova lista chamada names do tipo String
		// essa lista tem os nomes em caixa alta
		// mandou imprimir cada elemento da lista
		names.forEach(System.out::println);
	}

}
