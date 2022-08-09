package youinvest_spr.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateConverter {
	
	public static GregorianCalendar StringtoDate(String Date) {
		
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		int Year = dt.parse(Date).get(ChronoField.YEAR);
		int Month = dt.parse(Date).get(ChronoField.MONTH_OF_YEAR);
		int Day = dt.parse(Date).get(ChronoField.DAY_OF_MONTH);
		
		GregorianCalendar g = new GregorianCalendar();
		
		
		g.clear();
		g.set(Year, Month, Day,0,0,0);
		
		
		return g;
		//System.out.println(dt.parse("01/01/2000").get(ChronoField.YEAR));
		//System.out.println(dt.parse("01/01/2000").get(ChronoField.MONTH_OF_YEAR));
		//System.out.println(dt.parse("01/01/2000").get(ChronoField.DAY_OF_MONTH));
		
	}
	
	public static String DatetoString(GregorianCalendar Date) {
		
		int day = Date.get(Calendar.DAY_OF_MONTH);
		int month = Date.get(Calendar.MONTH);
		int year = Date.get(Calendar.YEAR);

		return day +"/" + month + "/" + year;
	}

}
