package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {
		/* Predicado é uma função que recebe um objeto
		 * e retorna true ou false
		 * Fazer um programa que, a partir de uma lista de produtos, remova da
		 * 	lista somente aqueles cujo preço seja igual ou maior que 100.
		*/
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// implementação da interface  
		// list.removeIf(new ProductPredicate());
		
		// implementação reference method 
		// list.removeIf(Product::staticProductPredicate);
		
		// implementação com método não estatico 
		// list.removeIf(Product::noStaticProductPredicate);
		
		// implementação com expressão lambda declarada 
		// Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		// list.removeIf(pred);
		
		// implementacão com expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
