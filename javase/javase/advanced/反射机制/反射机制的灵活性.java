package javase.advanced.反射机制;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 反射机制：
 * 		反射机制可以访问Class文件
 * 		反射机制可以让程序更加灵活
 * @author Passerby
 *
 */
public class 反射机制的灵活性 {

	public static void main(String[] args) {

		//以下代码不需要改变，只需修改配置文件，就可以创建不同的实例对象
		FileReader reader = null;
		try {
			reader = new FileReader("userinfo.properties");
			Properties properties = new Properties();
			properties.load(reader);
			String className = properties.getProperty("user");
			Class c = Class.forName(className);
			Object o = c.newInstance();
			System.out.println(o);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}finally {
			if (reader == null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
