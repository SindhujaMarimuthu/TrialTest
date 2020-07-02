package Scuba.javatraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		Date  date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat fmt = new SimpleDateFormat("YYYY/MM/D 'at' hh-mm-ss a zzz");
	
				System.out.println("Current Date:" +fmt.format(date));
				
	
	//Date date1 = formatter.parse
	
	}

}
