package herdar_vs_cumprir_contrato_1;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * As variaveis não podem ser do tipo Shape para 
		 * consegui pegar a cor
		*/
		AbstractShape circle = new Circle(Color.BLUE, 2.0);
		AbstractShape rectangle = new Rectangle(Color.RED, 3.0, 4.0);
		
		System.out.println(circle.area());
		System.out.println(rectangle.area());
		
		System.out.println(circle.getColor());

	}

}
