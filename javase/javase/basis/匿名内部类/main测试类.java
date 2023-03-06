package javase.basis.匿名内部类;

public class main测试类 {

	public static void main(String[] args) {
		
		//匿名内部类
		MyMath math = new MyMath();
		math.mySum(new Compute(){

			public int sum(int a, int b) {
				return a+b;
			}
			
		}, 10, 20);
	}

}

interface Compute{
	
	int sum(int a,int b);
}
/**
 * 数学类
 * @author 王爸爸
 *
 */
class MyMath{
	
	public void mySum(Compute c,int x,int y) {
		int value = c.sum(x, y);
		System.out.println(x+"+"+y+"="+value);
	}
}
