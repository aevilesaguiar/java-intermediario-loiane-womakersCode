package br.com.aeviles.aula85_100;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Set;

public class Aula93DatasJava8 {

	public static void main(String[] args) {

		// data dd MM yyyy
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		System.out.println(LocalDate.of(2022, 2, 11));

		System.out.println(LocalDate.parse("2022-02-11"));

		// api LocalDate é facil adicionar e diminuir dias

		System.out.println(agora.plusDays(30));
		System.out.println(agora.minusDays(30));
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getMonthValue());
		System.out.println(agora.getYear());
		System.out.println(agora.isLeapYear());
		System.out.println(LocalDate.parse("2024-02-11").isLeapYear());

		// trabalhar apenas com o horario

		LocalTime hagora = LocalTime.now();// segue o horario militar
		System.out.println(hagora);

		System.out.println(LocalTime.of(9, 5));
		System.out.println("Data: " + LocalDate.now() + " Hora: " + LocalTime.parse("09:06"));

		System.out.println(hagora.plusHours(2));
		System.out.println(hagora.plusMinutes(45));

		System.out.println(hagora.minusMinutes(120));
		System.out.println(hagora.getHour());

		//data complera=data+hora(formato ISO)
		LocalDateTime hagoraCompleto=LocalDateTime.now();
		System.out.println(hagoraCompleto);
		
		System.out.println(hagoraCompleto.plusYears(25));
		
		//System.out.println(LocalDateTime.parse("2022-2-11T09:13:20"));		
		System.out.println(LocalDateTime.of(2022,2,11,9,13,20));
		
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		for (String f : fusos) {
			System.out.println(f);
		}
		
		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2022-02-11T09:20:55"),sp);
		System.out.println(zdt);
		
		System.out.println(ZonedDateTime.parse("2022-02-11T09:20:55-03:00[America/Sao_Paulo]"));
		
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		OffsetDateTime offsetdt= OffsetDateTime.of(hagoraCompleto, offset);
		System.out.println(offsetdt);
		
		Date date = new Date(0);
		Calendar c = Calendar.getInstance();
		//LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), sp);
		//System.out.println(ldtDate);
		
		//System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
		
		
		
		
		

	}

}
