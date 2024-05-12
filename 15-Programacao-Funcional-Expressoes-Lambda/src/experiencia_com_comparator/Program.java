package experiencia_com_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("Computer", 2000.0));
		list.add(new Product("Phone", 800.0));
		
		// com os commits das diferentes maneiras de usar o comparable
		// https://github.com/acenelio/lambda1-java

		
		// uma maneira - criar uma classe separada
		// list.sort(new MyComparator());
		
		// ordenar os produtos por nome
		
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	
		list.sort(comp);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
