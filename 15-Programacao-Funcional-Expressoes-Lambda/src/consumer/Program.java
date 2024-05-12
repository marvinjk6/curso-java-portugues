package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

	public static void main(String[] args) {
		/*
		 * Consumer é uma função que recebe um objeto como argumento
		 * e atualiza determinado atributo
		 *  Fazer um programa que, a partir de uma lista de produtos, aumente o
		 *  preço dos produtos em 10%.
		 *  
		 *  list.forEach percorre a coleção e executa uma ação para cada elemento
		 */
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double percentage = 1.1;
		
		// implementação da interface
		// list.forEach(new PriceUpdate());
		
		// implementação com método estatico 
		//list.forEach(Product::staticUpdatePrice);
		
		// implementação com método estatico 
		//list.forEach(Product::noStaticUpdatePrice);
		
		// implementação com expressão lambda declarada 
		//Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * percentage);
		//list.forEach(consumer);
		
		// implementacão com expressão lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * percentage));
		
		list.forEach(System.out::println);
		
	}

}
