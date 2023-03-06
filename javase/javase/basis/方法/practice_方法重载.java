package javase.basis.方法;

public class practice_方法重载 
{
	
	public static void main(String[]ages)
	{
		double sum1=add(2.5,5.1,6.6);
		
		System.out.println(sum1);
		
	}
	public static double add(double x, double y, double z)
	{
		double sum=x+y+z;
		return sum;
	}
	public static int add(int x, int y)
	{
		int sum=x+y;
		return sum;
	}
	public static int add(int x, int y, int z)
	{
		int sum=x+y+z;
		return sum;
	}
	public static double add(double x, double y)
	{
		double sum=x+y;
		return sum;
	}
	
}
