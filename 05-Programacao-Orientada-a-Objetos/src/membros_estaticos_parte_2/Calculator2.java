package membros_estaticos_parte_2;

public class Calculator2 {
	
	public final double PI = 3.14159; // final usada para constante tudo letra maiuscula
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * (radius * radius * radius) / 3;
	}
}
