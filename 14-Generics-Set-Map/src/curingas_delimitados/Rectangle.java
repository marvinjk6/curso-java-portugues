package curingas_delimitados;

public class Rectangle implements Shape {
	
	private Double with;
	private Double height;
	
	
	public Rectangle(Double with, Double height) {
		this.with = with;
		this.height = height;
	}
	
	public Double getWith() {
		return with;
	}
	
	public void setWith(Double with) {
		this.with = with;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return with * height;
	}
	
	

}
