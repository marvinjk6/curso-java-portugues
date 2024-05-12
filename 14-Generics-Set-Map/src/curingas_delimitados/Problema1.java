package curingas_delimitados;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {

	public static void main(String[] args) {
		
		// o método totalArea só vai funcionar para uma lista de Shape
		// uma lista de Circles ou Rectangles o método totalArea não funciona
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));

	}
	/*
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	*/
	
	//Agora o método aceita lista de Rectangles e Circles
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
