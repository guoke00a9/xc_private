package javase.macase.单链表.数组;

public class practice_二维数组 {
	public static void main(String[]args)
	{
		
		/*
		//定义一个静态二维数组：二位数组里面就是特殊的一维数组
		int [][] arr= 
			{
				{1,2,3},
				{10,20,30,40},
				{100,200,300,400,500}
			};
		System.out.println(arr.length);//输出的是二维数组中几个一维数组
		System.out.println(arr[1].length);//输出的是下标为1的一维数组元素的个数
		System.out.println(arr[2][3]);//输出的是二维数组的下标为2的一维数组中下标为3的元素
		*/
		
		
		/*
		//遍历二维数组
		String [][] arr= {
				{"张三","李四","王五","赵六","孙七"},
				{"非常喜欢","不太喜欢","喜欢","一般","不喜欢"},
				{"java","c","c++","c#","python"}
		};
		
		for(int i=0;i<arr.length;i++)//外层循环，负责纵向输出
		{
			String [] arr01 = arr[i];
			for(int j=0;j<arr01.length;j++)//内层循环负责输出一行元素
			{
				System.out.print(arr01[j]+"    ");
			}//内层循环
			
			//外层循环换行
			System.out.println();
			
		}//外层循环
		
		
		for(int i=0;i<arr.length;i++)//外层循环，负责纵向输出
		{
			for(int j=0;j<arr[i].length;j++)//内层循环负责输出一行元素
			{
				System.out.print(arr[i][j]+"    ");
			}//内层循环
			
			//外层循环换行
			System.out.println();
			
		}//外层循环
		*/
		
		//方法调用
		//定义一个动态初始化二维数组
		//3行4列的二维数组
		//int [][]arr01=new int[3][4];
		int[][] x = {
				{1,3,8,9},
				{2,5,4,6},
				{1,5,9,5}
		};
		int sum=0;//赋初值
		for(int i=0;i<x.length;i++)
		{
			int sum01=0;//赋初值
			for(int j=0;j<x[i].length;j++)
			{
				sum01=sum01+x[i][j];//遍历数组元素相加
			}//for  内层循环
			sum+=sum01;//求二维数组的总和
			System.out.printf("下标为%d的数组之和为%d：",i,sum01);//依次输出内层循环的一维数组
			System.out.println();//内层循环完一次后换行
		}//for 外层循环
		System.out.printf("二维数组的总和为：%d",sum);//输出总和
		/*
		//调用方法
		shuzu(x);
		//同上
		shuzu(new int [][]{{1,3,8,9},{2,5,4,6},{1,5,9,5}});
		*/
	}
	public static void shuzu(int[][]arr01) {
		//遍历二维数组
		for(int i=0;i<arr01.length;i++)
		{
			for(int j=0;j<arr01[i].length;j++)
			{
				System.out.print(arr01[i][j]+"  ");
			}//for  内层循环
			System.out.println();
		}//for 外层循环
	}//main
}//类
