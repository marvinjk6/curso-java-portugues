package exercicio_fixacao;

public class Employee {

	private String name;
	private String email;
	private Double salary;
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " - " + email + " - R$ " + String.format("%.2f", salary);
	}
	
	
	
	
}
