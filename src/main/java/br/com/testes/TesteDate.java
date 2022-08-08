package br.com.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

import br.com.utils.DateConverter;

public class TesteDate {
	
	
	 public static void main(String[] args) {
	  
	  LocalDate date = LocalDate.now();
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
	  String text = date.format(formatter);
	  LocalDate parsedDate = LocalDate.parse(text, formatter);
	  
	  
	  System.out.println(DateConverter.StringtoDate("01/01/2000").toString());
	  System.out.println(DateConverter.StringtoDate("01/01/2000").toString());
	  System.out.println(DateConverter.StringtoDate("18/01/2000").toString());
	  
	  GregorianCalendar g = DateConverter.StringtoDate("18/01/2000");
	  
	  System.out.println(DateConverter.DatetoString(g));
	  
	  
	  
	}
	


}
