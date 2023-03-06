package javase.basis.判断;
import java.util.*;

@SuppressWarnings("unused")
public class Practice_if判断天数 {
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		System.out.print("请输入一个月份");
		Scanner cin=new Scanner(System.in);
		//double s=cin.nextDouble();输入一个双精度
		//String s=cin.next();输入一行字符串
		//String s=cin.nextLine();输入一行字符串 中间可有空格
		int s=cin.nextInt();

		if(s==1||s==3||s==5||s==7||s==8||s==10||s==12)
		{
			System.out.print(s+"月有31天");
		}
		else if(s==4||s==6||s==9||s==11)
		{
			System.out.print(s+"月有30天");
		}
		else if(s==2)
		{
			System.out.print(s+"月有28天");
		}
		else
		{
			System.out.print("您的输入有误");
		}
	}

}
