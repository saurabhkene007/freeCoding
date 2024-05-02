package miniProjectBank;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateReplace 
				{
	    public static void main(String[] args) 
	    	{
	        String input = "Thenumberis 12345678 ,butalso.";
	        String regex = "\\d{8}";
	        
	        Pattern p=Pattern.compile(regex);
	        Matcher m=p.matcher(input);
	        
	        if(m.find()) {
	     LocalDate d=LocalDate.now();
	     String r=d.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	        System.out.println(r);
	        String replaced = input.replaceAll(regex, r);

	        System.out.println("Original: " + input);
	        System.out.println("Replaced: " + replaced);
	    }}
	}
