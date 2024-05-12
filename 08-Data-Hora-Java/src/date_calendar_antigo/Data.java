package date_calendar_antigo;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Data {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		//SimpleDateFormat converte uma data para String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		// Data Atual
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("x1 : " + sdf2.format(x1));
		System.out.println("x2 : " + sdf2.format(x2));

		System.out.println("y1 : " + sdf2.format(y1));
		System.out.println("y2 : " + sdf2.format(y2));
		// Imprimiu 3 horas antes Horario UTC
		System.out.println("y3 : " + sdf2.format(y3));
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("x1 : " + sdf3.format(x1));
		System.out.println("x2 : " + sdf3.format(x2));
		System.out.println("y1 : " + sdf3.format(y1));
		System.out.println("y2 : " + sdf3.format(y2));
		System.out.println("y3 : " + sdf3.format(y3));

		
	}

}
