package javase.basis.判断;
import java.util.Random;
import java.util.Scanner;

public class Practice_随机数猜大小 {
	@SuppressWarnings("resource")
	public static void main(String[]args) {
		//生成随机数
		Random rand = new Random();
		int randomNumber = rand.nextInt(10)+1;
		//数据类型 变量名 = 赋值 创建/生成 随机类 . 类方法
		
		System.out.println("随机数已生成");
		
		int x=0;
		while(x==0)
		{
			//输出你要猜的数字
			System.out.println("-----请输入你猜的数字-----");//提示输入
			//控制台写信息
			//固定格式
			int enterNumber = 0;
			//通过循环判断 猜数字的对错
			while(enterNumber != randomNumber)//
			{
				Scanner sc = new Scanner(System.in);
				enterNumber = sc.nextInt();
				if(enterNumber>randomNumber)//输入数大于生成数输出sorry，您猜大了否则输出sorry，您猜小了
				{
					System.out.println("sorry，您猜大了");
					x=0;
					break;
				}else if(enterNumber<randomNumber){
					System.out.println("sorry，您猜小了");
					x=0;
					break;
				}else {
					System.out.println("恭喜，您猜对了");//如果循环判断条件成立则执行此条语句\
					x=1;
					break;
				}
			}
			
		}
	}
		
}
