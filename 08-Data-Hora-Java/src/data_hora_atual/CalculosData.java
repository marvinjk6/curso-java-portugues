package data_hora_atual;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d01 = LocalDate.parse("2022-10-12");
		LocalDateTime d02 = LocalDateTime.parse("2022-10-12T15:45");
		Instant d03 = Instant.parse("2022-10-12T01:45:34Z");
		
		// LocalDate, uma semana antes
		LocalDate pastWeek = d01.minusWeeks(1);
		LocalDate nextWeek = d01.plusDays(7);
		
		System.out.println(d01);
		System.out.println("Semana anterior = " + pastWeek);
		System.out.println("Próxima semana = " + nextWeek);
		
		// LocalDateTime, uma semana antes
		LocalDateTime pastYearLocalDateTime = d02.minusYears(1);
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

		
		System.out.println("LocalDateTime ano anterior = " + pastYearLocalDateTime);
		System.out.println("Semana anterior LocalDateTime = " + pastWeekLocalDateTime);

		// Instant
		Instant pastweekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextweekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana anterior Instant = " + pastweekInstant);
		System.out.println("Semana Posterior Instant = " + nextweekInstant);

		// Duração LocalDate
		Duration t1 = Duration.between(pastWeek.atTime(15, 45), nextWeek.atStartOfDay());
		System.out.println("t1 dias = " + t1.toDays());
		
		// Duração LocalDateTime
		Duration t2 = Duration.between(d02, nextWeekLocalDateTime);
		System.out.println("t2 dias = " + t2.toDays());
		
		// Duração Instant
		Duration t3 = Duration.between(pastweekInstant, d03);
		Duration t4 = Duration.between(d03, pastweekInstant);
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());




		
	}

}
