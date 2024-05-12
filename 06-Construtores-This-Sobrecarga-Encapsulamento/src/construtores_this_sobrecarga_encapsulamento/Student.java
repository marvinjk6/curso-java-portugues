package construtores_this_sobrecarga_encapsulamento;

public class Student {

	private String name;
	private double nota;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getNote() {
		return nota;
	}
	
	public void setNote(double nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return name + ", nota: " + String.format("%.2f", nota);
	}
}
