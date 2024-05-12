package experiencia_com_comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Product>{

	// positivo se p1 > p2
	// negativo se p1 < p2
	// 0 se forem iguais
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
