package heranca_polimorfismo_exercicio_resolvido2;

public abstract class Shape {

	private Color color;
	
	Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}



	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}



	public abstract double area();
}
