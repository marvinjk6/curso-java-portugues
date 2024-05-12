package set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Computer");
		set.add("Refrigerator");
		set.add("Mouse");
		set.add("Stove");
		
		System.out.println(set.contains("Notebook"));
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() <= 3); // remove as que tem menos de 3 carateres TV
		
		// HashSet não garante ordem 
		for (String p : set) {
			System.out.println(p);
		}

	}

}
