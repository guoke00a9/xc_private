package javase.basis.循环;

public class Practice_圣诞树 
{
	
	public static void main(String[]args) 
	{
		int x=50;//控制树输出在控制台的位置
		//1.树尖
		for(int i=0;i<=4;i++)//控制树枝循环几次输出几行
			{
				for(int j=x-i;j>=0;j--) //递归依次-1   梯形输出空格   控制形状
				{
					System.out.print(" ");//输出1个空格
				}
					for(int k=1;k<=i*2+1;k++)//由i决定第一行循环几次输出几个*
					{
						System.out.print("*");//输出1个*
					}
				System.out.println();//外循环每循环一次换行
				
			}
		
		try
		{
			Thread.sleep(100000);//单位：毫秒
		} catch (Exception e) { 
		}

		//2.树枝
		for(int i=3;i<=9;i++)//控制树枝循环几次输出几行
		{
			for(int j=x-i;j>=0;j--) //递归依次-1   梯形输出空格   控制形状
			{
				System.out.print(" ");//输出1个空格
			}
				for(int k=1;k<=i*2+1;k++)//由i决定第一行循环几次输出几个*
				{
					System.out.print("*");//输出1个*
				}
			System.out.println();		//外循环每循环一次换行		
		}
		
		//3.树枝
		for(int i=8;i<=15;i++)//控制树枝循环几次输出几行
		{
			for(int j=x-i;j>=0;j--) //递归依次-1   梯形输出空格   控制形状
			{
				System.out.print(" ");//输出1个空格
			}
				for(int k=1;k<=i*2+1;k++)//由i决定第一行循环几次输出几个*
				{
					System.out.print("*");//输出1个*
				}
			System.out.println();	//外循环每循环一次换行			
		}
		
		//4.树干
		for(int i=0;i<=11;i++)//控制树枝循环几次输出几行
		{
			for(int j=1;j<=x;j++) //递归依次-1   梯形输出空格   控制形状
			{
				System.out.print(" ");//输出1个空格
				 
			}
				for(int k=1;k<=3;k++)//由i决定第一行循环几次输出几个*
				{
					System.out.print("*");//输出1个*
				}
			System.out.println();//外循环每循环一次换行
		}
	}
}

