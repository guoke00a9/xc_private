package javase.advanced.反射机制;

import java.util.ResourceBundle;

public class 资源绑定器 {

	public static void main(String[] args) {

		/**
		 * 资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类路径下，文件扩展名也必须是properties
		 * 并且写路径的时候，路径后面的扩展名不能写
		 */
		ResourceBundle bundle = ResourceBundle.getBundle("userinfo");
		String className = bundle.getString("user");
		System.out.println(className);
	}

}
