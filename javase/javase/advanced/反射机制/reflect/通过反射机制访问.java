package javase.advanced.反射机制.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * Constructor		构造方法
 * invoke			调用
 * @author Passerby
 *
 */
public class 通过反射机制访问 {

	public static void main(String[] args) {

		try {
			Class studentClass = Class.forName("priv.xc.javase.advanced.反射机制.Class.Student");
			Object obj = studentClass.newInstance();
			//获取name（public）属性
			Field nameField = studentClass.getDeclaredField("name");
			nameField.set(obj,"王杰");
			System.out.println(nameField.get(obj));
			//获取no（private）
			Field noField = studentClass.getDeclaredField("no");
			/**
			 * 打破封装(反射机制的缺点)
			 * 		noField.setAccessible(true);
			 */
			Method loginMethod = studentClass.getDeclaredMethod("login",String.class, String.class);
			Object reValue = loginMethod.invoke(obj,"1111","1216");
			System.out.println((boolean) reValue ? "登陆成功":"登录失败");
			/**
			 * 调用无参数构造方法
			 * 		studentClass.newInstance();
			 */
			Constructor constructormMethod = studentClass.getDeclaredConstructor(String.class,String.class);
			Object obj1 = constructormMethod.newInstance("11111","1216");
			System.out.println(obj1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
