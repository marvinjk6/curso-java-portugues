package construtores_this_sobrecarga_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println(student);
	
		student.setName("Joao");
		student.setNote(10); 
		
		System.out.println(student);
		
		System.out.println("Updated name: " + student.getName());
		
		sc.close();
	}

}
