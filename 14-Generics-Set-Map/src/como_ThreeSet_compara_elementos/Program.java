package como_ThreeSet_compara_elementos;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		// para o TreeSet ordenar oconjunto o Product(Objeto) deve ser uma implementação
		// do Comparable
		for(Product p : set) {
			System.out.println(p);
		}
		
	}

}
