package programacao_funcional_calculo_lambda;

import java.util.ArrayList;
import java.util.List;

// importou o product
import experiencia_com_comparator.Product;

public class FuncoesObjetosPrimeiraClasse {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		// na programação funcional, pode passar uma função como 
		// argumento de outra função, isso é função de primeira Classe
		list.sort(FuncoesObjetosPrimeiraClasse::compareProducts);
		
		list.forEach(System.out::println);
		

	}

}
