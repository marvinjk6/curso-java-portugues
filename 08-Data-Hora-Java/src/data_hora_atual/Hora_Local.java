package data_hora_atual;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hora_Local {

	public static void main(String[] args) {
	
		// o código abaixo permite passar uma data costumizada no parse		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now(); 
		
		// parse transforma um texto em uma data
		// passar uma data costumizada com o segundo argumento de parse
		LocalDate d03 = LocalDate.parse("2020-07-02");
		LocalDate d04 = LocalDate.parse("02/07/2020", dtf1);
		LocalDateTime d05 = LocalDateTime.parse("2019-07-09T17:45:03");
		LocalDateTime d06 = LocalDateTime.parse("09/07/2019 17:45", dtf2);
	
		// Passei o formato como argumento direto
		LocalDate d07 = LocalDate.parse("18/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		// Instanciando a partir de dados isolados
		LocalDate d08 = LocalDate.of(2001, 7, 25);
		LocalDateTime d09 = LocalDateTime.of(2009, 3, 30, 17, 44);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		
	}

}
