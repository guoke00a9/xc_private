package javase.basis.java工具;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("unused")
public class dateTime {
	public static void main(String[]args) {
		
		
		//获取当前日期
		LocalDate date=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		System.out.println(date.format(formatter));  
		
		//获取当前时间
		LocalTime time=LocalTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");  
		System.out.println(time.format(formatter1)); 
		
		//获取当前日期时间
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		System.out.println(dateTime.format(formatter2));  
		
		
	}
}
