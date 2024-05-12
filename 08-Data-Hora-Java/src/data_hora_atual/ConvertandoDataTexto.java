package data_hora_atual;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertandoDataTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2022-10-12");
		LocalDateTime d02 = LocalDateTime.parse("2022-10-12T15:45");
		Instant d03 = Instant.parse("2022-10-12T15:45:34Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));

		
		System.out.println("d02 = " + d02.format(fmt2));
		
		System.out.println("d03 = " + fmt3.format(d03));


	}

}
