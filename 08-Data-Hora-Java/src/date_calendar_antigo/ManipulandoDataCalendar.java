package date_calendar_antigo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class ManipulandoDataCalendar {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		// adicionando hora
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		// pegando dados da hora
		Date data = Date.from(Instant.parse("2022-10-10T17:30:44Z"));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1+ calendar.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);


	}

}
