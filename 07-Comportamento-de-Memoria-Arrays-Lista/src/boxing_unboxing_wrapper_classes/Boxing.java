package boxing_unboxing_wrapper_classes;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		
		// boxing
		Object obj = x;
		
		System.out.println(obj);
		
		// unboxing
		int y = (int) obj;
		
		System.out.println(y);


	}

}
