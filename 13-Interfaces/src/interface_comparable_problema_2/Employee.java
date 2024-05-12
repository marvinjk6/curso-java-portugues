package interface_comparable_problema_2;

/* o metodo sort só pode ordenar uma lista 
se ela for do tipo comparable, por isso a classe Employee precisa
implementar a classe Comparable*/

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// método compareTo da Classe Comparable
	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
		// -name.compareTo(o.getName()); ordem decrescente
		//salary.compareTo(o.getSalary()); ordem crescente pelo salário
		
	}
	/* 
	 * o comparTo retorna um número inteiro
	 * positivo quando o objeto aparece depois na ordem
	 * negativo quando o objeto aparece antes na ordem
	 * 0 quando são iguais
	 * 
	 */
}
