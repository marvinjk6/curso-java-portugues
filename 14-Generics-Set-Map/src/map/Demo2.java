package map;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		// o Map contém o preço total de determinado produto
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1,  10000.0);
		stock.put(p2,  20000.0);
		stock.put(p3,  15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		// vai retornar true se a classe Product tiver equals e hashCode
		// pois os valores dos objetos são iguais, o equals e hashCode
		// comparam por valor, ps e p1 possuem os mesmos valores
		
		// retorna false se a classe Product não tiver equals e hashCode
		// pois a referencia é por ponteiro, são objetos diferentes
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
