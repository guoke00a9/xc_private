package javase.basis.java工具;

import java.util.Scanner;

public class Scannerr {
		
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		/*
		System.out.println("请从输出一个整数");
		int x = scanf.nextInt();
		System.out.println("您输入的整数是"+x);
		*/
		System.out.println("请从输出一个字符串");
		String name = scanf.nextLine();
		System.out.println("您输入的字符串是："+name);
		
		
	}
}
