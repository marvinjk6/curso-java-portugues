package exercicio_fixacao_1;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	Employee() {
		
	}
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getId() {
		return id;
	}
	
	
	public void increaseSalary(double percentage) {
		salary += salary * (percentage / 100.0); 
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	

}
