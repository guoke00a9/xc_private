package javase.macase.单链表.数组;

import java.util.Random;
import java.util.Scanner;

public class practice_随机点名器 {
	public static void main(String[]args)
	{
		/*
		 * 存储全班姓名
		 * 创建一个存储多个同学的容器（数组）
		 * 键盘输入每个同学的姓名，存储到容器
		 */
		@SuppressWarnings("unused")
		String [] student= new String[2];
		addStudentName(student);
		
		printfStudentName(student);
		
		String randomName=randomStudentName(student);
		System.out.println("其中"+randomName+"有大病");
	}
	
	@SuppressWarnings("resource")
	public static void addStudentName(String[]student)
	{
		//键盘输入多个学生姓名到容器（数组）中
		Scanner sc= new Scanner(System.in);
		//接受控制台输入的学生的姓名
		for(int i=0;i<student.length;i++)
		{
			System.out.println("请输入第"+(i+1)+"个学生:");
			student[i]=sc.next();
		}
		
	}
	
	public static void printfStudentName(String[]student)
	{
		for(int i=0;i<student.length;i++)
		{
			String name = student[i];
			System.out.println("第"+(i+1)+"个学生是:"+name);
		}
	}
	
	public static String randomStudentName(String[]student)
	{
		int randomNumber = new Random().nextInt(student.length);
		String name=student[randomNumber];
		return name;
		
	}
	
	
	

}
