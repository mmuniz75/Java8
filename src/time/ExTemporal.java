package time;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExTemporal {
	

	public static void main(String [] args){
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate venc = LocalDate.of(2017, 7, 10);
		
		System.out.println("Pagar no banco até dia : " + venc.plusDays(30).format(df));
		
		Date old = new Date();
		
		LocalDate date = old.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(date.format(df));
		
	}
	

}
