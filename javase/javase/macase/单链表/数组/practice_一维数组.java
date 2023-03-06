package javase.macase.单链表.数组;

@SuppressWarnings("unused")
public class practice_一维数组 
{
	public static void main(String[]args)
	{
/*
数据类型默认值
	数据类型			       默认值
	
	byte				0
	short				0
	int					0
	long				0L
	float				0.0F
	double				0.0
	boolean				false
	char				\u0000
	引用数据类型				null
*/
	
		
		/*
		 初始化数组--------------
		 静态初始化：//当创建数组的时候，确定数组中存放哪些数据的时候，采用静态初始化方式
		 	int [] arr = {10,20,30,40,50};
		 动态初始化：//当创建数组的时候，不缺定将来数组采用哪些数据，采用动态数组初始化的方式，预先分配内存空间
		 	int [] arr = new int[5];//初始化一个5个长度的int类型数组，每个元素默认值为0
		 	srting [] arr = new string[6];//初始化6个长度为string类型的数组，每个元素默认值为null
		 */
	
		
		/*
		int [] arr = {1,2,3,4,5};//静态初始化方式
		System.out.println(arr.length);//输出数组元素的个数
		*/
	
		
		//数组所有对象中都有length属性
		//数组每个元素都有下标
		
		
		/*
		System.out.printf("第一个元素为%d\n",arr[0]);
		System.out.printf("最后一个元素为%d\n",arr[arr.length-1]);
	
		
		arr [0] = 100;
		arr [arr.length-1] = 0;

		
		System.out.printf("第一个元素为%d\n",arr[0]);
		System.out.printf("最后一个元素为%d\n",arr[arr.length-1]);
		*/
	
		
		/*
		//遍历数组
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
		
		//倒叙输出
		for(int i=arr.lenght;i>=0;i++)
		{
			ystem.out.println(arr[i]);
		}
		*/

		
		//用户输入然后遍历数组
		/*
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
				*/
	
		
		//求最小值   方法调用
		/*
		int [] arr = {4,5,9,10,5,6,55,100,1,68,101};
		int mix = getMax(arr);
		System.out.println(mix);	
		*/	
	
		
		//冒泡排序--静态数组
		/*
		int [] arr = {9,8,3,5,2};
		int count=0;//定义int类型变量   统计循环次数
		
		
			for (int i=arr.length-1;i>0;i--)//外层循环
			{
				for(int j=0;j<i;j++)
				{
					count++;//统计交换次数
					if(arr[j]>arr[j+1])//第一个元素与第二个元素比较   
									   //满足条件交换值    
									   //不满足则执行内循环继续判断
					{
						int lemp=arr[j];//lemp临时存放数据   交换数据   j+1与j转换
						arr[j]=arr[j+1];//标为j+1的元素赋值给下标为j的元素
						arr[j+1]=lemp;//下标为j的元素的值复制给下标为j+1的元素
					}
				}//内层循环

				System.out.printf("第%d轮排序后：",i);
				for(int n=0;n<arr.length;n++)//遍历交换后的数组
				{
					System.out.print(arr[n]+"  ");//输出遍历后的数组
				}	
				System.out.println();
				
			}//外层循环
			
			System.out.printf("冒泡排序两两总共比较了%d次\n",count);//输出统计次数
			for(int i=0;i<arr.length;i++)//遍历交换后的数组
			{
				System.out.print(arr[i]+"  ");//输出遍历后的数组
			}	
			*/
			
			
		
		int[] arr = {9,8,3,5,2};
		System.out.print("冒泡排序前：");
		staticArray(arr);   //打印数组元素
		staticArray01(arr);   //调用排序方法
		System.out.print("冒泡排序后：");
		staticArray(arr);
			
		
	}//main
	 
	//遍历数组
	public static void staticArray(int[]arr)
	{
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");//打印元素和空格
		}
		System.out.print("\n");
	}//staticArray方法
	
	//定义一个静态数组冒泡排序的方法
	//遍历后
	public static void staticArray01(int[]arr)
	{
		int count=0;//定义int类型变量   统计循环次数
		for (int i=0;i<arr.length;i++)//外层循环
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				count++;//统计交换次数
				if(arr[j]>arr[j+1])//第一个元素与第二个元素比较   
								   //满足条件交换值    
								   //不满足则执行内循环继续判断
				{
					int temp=arr[j];//lemp临时存放数据   交换数据   j+1与j转换
					arr[j]=arr[j+1];//标为j+1的元素赋值给下标为j的元素
					arr[j+1]=temp;//下标为j的元素的值复制给下标为j+1的元素
				}
			}//内层循环
			System.out.printf("第%d轮排序后：",i+1);
			staticArray(arr);
			
		}//外层循环
		System.out.printf("冒泡排序两两总共比较了%d次\n",count);//输出统计次数
	}//staticArray01方法
	

	
	//定义一个静态数组冒泡排序的方法
	//遍历后
//	public static void staticArray01(int[]arr){
//				for(int i=0;i<arr.length;i++)
//				{
//					for(int j=0;j<arr.length-i-1;j++)
//					{
//						if(arr[j]<arr[j+1])
//						{
//							int temp=arr[j];
//							arr[j]=arr[j+1];
//							arr[j+1]=temp;
//						}
//					}
//					System.out.print("第"+(i+1)+"轮排序后：");
//					staticArray01(arr);
//				}		
//	}//staticArray01方法
	
	
	
	
	
	
	
	
	
	 //定义一个方法
	/*
	 public static int getMax(int[]arry)
	 {
		 int mix = arry[0];
		 for(int x=1;x<arry.length;x++)
		 {
			 if(arry[x]<mix)
			 {
				 mix=arry[x];
			 }
		 }
		 return mix;
	 }
	 */
	 
}//类

