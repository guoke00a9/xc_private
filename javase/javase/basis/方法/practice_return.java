package javase.basis.方法;

public class practice_return {
		public static void main(String[] args) {
			a();
		}
		public static void a() {
			for (int i = 0; i < 10; i++) {
				if(i==5) {
					return;//return终止a方法
						   //break终止for循环
						   //作用域不同，一个是当前循环，一个是当前方法
				}
				System.out.println("i:"+i);
			}
		}
}

