package entrada_dados;


public class processamentoDados {
	
	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2 * h;
		
		System.out.printf("A area é: %.2f %n", area);
		
		
		int x, y; 
		double resultado;
		
		x = 5;
		y = 2;
		
// escreveu double antes para o java entender que é um numero doble
		resultado = (double) x / y;
		
		System.out.println(resultado);
	
	}
	
}
