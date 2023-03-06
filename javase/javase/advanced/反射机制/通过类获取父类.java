package javase.advanced.反射机制;

public class 通过类获取父类 {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("java.lang.String");
			//获取父类
			Class superClass = c.getSuperclass();
			System.out.println(superClass.getName());
			//获取String实现的所有接口
			Class[] interfaces = c.getInterfaces();
			for (Class class1 : interfaces) {
				System.out.println(class1.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
