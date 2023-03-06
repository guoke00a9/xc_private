package javase.advanced.反射机制;

public class 通过Class实例化对象 {

	public static void main(String[] args) {
		//通过反射机制，获取Class文件，通过Class来实例化对象
		try {
			//c代表Cat类型
			Class c = Class.forName("priv.xc.javase.basis.面向对象.多态.Cat");
			//c.newInstance()实例化Cat类型的对象
			Object o = c.newInstance();//newInstance()这个方法会调用Cat的无参数构造方法，完成对象的创建
			System.out.println(o);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
