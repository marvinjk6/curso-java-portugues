package data_hora_atual;

import java.time.Instant;

public class Hora_global {

	public static void main(String[] args) {

		
		Instant d01 = Instant.now();
		//Precisa do z no final
		Instant d02 = Instant.parse("2022-10-10T17:30:05Z");
		
		
		System.out.println("Horario global d01 = " + d01);
		System.out.println("Data passada d02 = " + d02);
		

		
	}

}
