package youinvest_spr.testes;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import youinvest_spr.utils.DateConverter;

public class TesteDate {
	
	
	 public static void main(String[] args) {
	  
	  LocalDate date = LocalDate.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  String text = date.format(formatter);
	  LocalDate parsedDate = LocalDate.parse(text, formatter);
	  
	  
	  System.out.println(DateConverter.StringtoDate("01/12/2000").toString());
	  System.out.println(DateConverter.StringtoDate("01/12/2000").toString());
	  System.out.println(DateConverter.StringtoDate("18/12/2000").toString());
	  
	  GregorianCalendar g = DateConverter.StringtoDate("18/01/2000");
	  
	  System.out.println(DateConverter.DatetoString(g));
	  
	  
	  Timestamp time1 = new Timestamp(g.getTime().getTime());
	  
	  System.out.println(time1.toString());
	  
	  
	  
	}
	


}
