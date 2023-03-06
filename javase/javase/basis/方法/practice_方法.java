package javase.basis.方法;

public class practice_方法 {
	public static void main(String[]args)
	{

		rectangle(3,5);
		rectangle(2,4);
//		rectangle(10,10);
	}
	
	public static void rectangle(int height,int width)
	{
		for(int i=0; i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
