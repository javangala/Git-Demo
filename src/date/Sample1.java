package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Sample1 {

	public static void main(String[] args) {


		Date date=new Date();
		System.out.println(date);

		LocalDateTime current=LocalDateTime.now();

		System.out.println(current);


		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
		String formated=current.format(formatter);
		System.out.println(formated);


		//		System.out.println("togrt a Year..."+date.getYear()); 
		//
		//		System.out.println("to get a month..."+date.getMonth()); 
		//
		//		System.out.println("to get a Date..."+date.getDate());
		//
		//		System.out.println("to get a day..."+date.getDay()); 
		//
		//		System.out.println("to get a Hours..."+date.getHours()); 
		//		
		//		System.out.println("to get a Time..."+date.getTime()); 
		//
		//		System.out.println("to get Mnutes..."+date.getMinutes()); 
		//		
		//		System.out.println("to get a Seconds...."+date.getSeconds());

	}

}
