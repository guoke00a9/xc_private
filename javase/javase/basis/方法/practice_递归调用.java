package javase.basis.方法;

public class practice_递归调用 {
	public static void main(String[] args) {

		System.out.println(sum(5));
		
	}
	
	public static int sum(int n) {//4+3+2+1
		if(n==1)
		{
			return 1;
		}
		return n+sum(n-1);
	}
	
}
