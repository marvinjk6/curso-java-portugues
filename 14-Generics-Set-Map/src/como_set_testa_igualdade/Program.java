package como_set_testa_igualdade;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		// A resposta do contains será falso se não existir o equals e hashCode
		// pois será uma comparação por referencia e não conteúdo
		System.out.println(set.contains(prod));

	}

}
