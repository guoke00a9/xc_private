package javase.basis.java工具;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class 延时函数 {
		public static void main(String[] args) {
			printTime();
			try {
				Thread.currentThread().sleep(3300);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			printTime();
		}
		public static void printTime() {
			LocalTime time=LocalTime.now();
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");  
			System.out.println(time.format(formatter1)); 
		}
}
