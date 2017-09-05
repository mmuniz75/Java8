package time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class TemporalTest {
	
	public static void main(String[] args){
		
		Instant start = Instant.now();
		Instant end = Instant.now();
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration.toMillis());
		
		LocalDate date = LocalDate.of(1975, 8, 25);
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		
		Period period = date.until(LocalDate.now());
		long years = date.until(LocalDate.now(),ChronoUnit.YEARS);
		
		System.out.println(period.getYears());
		System.out.println(years);
		
		LocalDate now = LocalDate.now();
		LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		
		System.out.println(nextSunday.getDayOfMonth());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime startTime = LocalTime.of(21, 32);
		System.out.println(startTime);
		
		System.out.println(startTime.plusHours(8));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		String zoneTime = ZoneId.of("Brazil/East").toString();
		System.out.println(zoneTime);
		
		ZonedDateTime usTime = ZonedDateTime.of(now,time, ZoneId.of("Brazil/East"));
		System.out.println(usTime);
		System.out.println(usTime.withZoneSameInstant(ZoneId.of("US/Eastern")));
		
		
		LocalDate interview = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(interview));
		
		System.out.println(interview.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
	}

}
