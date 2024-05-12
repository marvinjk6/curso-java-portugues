package tipos_curinga;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// O tipo interrogação é o super tipo de List
		// List<Object> não é o super tipo de List
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		

	}	

}
