package heranca_polimorfismo_exercicio_fixacao1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate; 
	
	UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " (used) , $"  
				+ String.format("%.2f", getPrice()) 
				+ " (Manufacture date: " 
				+ sdf.format(manufacturedDate) 
				+ ")";
	}

}
