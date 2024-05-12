package tipos_curinga;

import java.util.Arrays;
import java.util.List;

public class Curinga {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStr);

	}

	public static void printList(List<?> list) {
		//list.add(3); não é possivel adicionar dados a uma lista generica
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
