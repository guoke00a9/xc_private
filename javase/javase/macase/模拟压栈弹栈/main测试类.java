package javase.macase.模拟压栈弹栈;

public class main测试类 {
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		int x = 0;
		while (x < 11) {
			try {
				ms.push(new Animal());
				x++;
			} catch (MyException e) {
				// TODO 自动生成的 catch 块
				//e.printStackTrace();
				System.out.println(e.getMessage());
				return;
			}
		}
		
		/*
		UserService userService = new UserService();
		
		try {
			userService.register("asda","123456");
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			System.out.println(e.getMessage());
		}
		*/
	}
}


