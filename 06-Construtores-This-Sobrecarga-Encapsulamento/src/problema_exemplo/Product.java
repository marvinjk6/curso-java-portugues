package problema_exemplo;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// Contrutor Padrão - para instanciar
	public Product() {
		
	}

	// Construtor Personalizado
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Construtor alternativo - a sobrecarga se trata de dar mais de uma opção de construtor
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	//métodos Setters e Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, "
				+ String.format("%.2f", totalPrice());
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public double totalPrice() {
		return quantity * price;
	}

}
