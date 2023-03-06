/*
高内聚   低耦合

命名规则
见名知意  驼峰命名规则
类名、接口名：首字母大写，单词开头大写
变量名、方法名：首字母小写、单词开头大写
常量名：全部大写
java（字面值）==c语言（常量）   c语言（常量）！=java（常量）
*/
package javase.macase.单链表.数组;

import java.util.Scanner;

public class practice_输入成绩遍历 
	{
			@SuppressWarnings("resource")
			public static void main(String[]args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("请输入数组的长度：");
				int n=sc.nextInt();
				int [] arr = new int[n];
				System.out.println("5个人的成绩：");
				for(int i=0;i<n;i++)
				{                                                                                                                                                                                                                                                                                                  
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+"  ");
				}
				
	}
}