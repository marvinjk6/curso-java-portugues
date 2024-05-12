package function;

import java.util.function.Function;
										// tipo input, tipo resultado
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
