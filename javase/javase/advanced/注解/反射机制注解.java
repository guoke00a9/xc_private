package javase.advanced.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@MyAnnotations
public class 反射机制注解 {

	@myannota(user = "zhangsan",password = "123456")
	public void doSome() {}
	
	@MyAnnotations
	public static void main(String[] args) {

		try {
			Class c = Class.forName("priv.xc.javase.advanced.注解.反射机制注解");
			/**
			 * 判断这个类是否有@MyAnnotation注解
			 * System.out.println(c.isAnnotationPresent(MyAnnotations.class));
			 */
			if (c.isAnnotationPresent(MyAnnotations.class)) {
				//获取注解对象
				MyAnnotations myAnnotations = (MyAnnotations)c.getAnnotation(MyAnnotations.class);
				System.out.println(c.getSimpleName()+"上面的注解对象:"+myAnnotations);
				//获取注解对象的属性的值
				System.out.println(myAnnotations.value());
			}
			
			/**
			 * 获取myannota的doSome()放上面的注解信息
			 * 		1.获取类
			 * 			Class c = Class.forName("priv.xc.javase.advanced.注解.只允许标注类和方法");
			 * 		2.获取方法
			 * 			Method doMethod = c.getDeclaredMethod("doSome");
			 */
			Method doMethod = c.getDeclaredMethod("doSome");
			if (doMethod.isAnnotationPresent(myannota.class)) {
				myannota myannota = doMethod.getAnnotation(myannota.class);
				System.out.println(myannota.user());
				System.out.println(myannota.password());
			}
			
			
			
			
			Class stringClass = Class.forName("java.lang.String");
			System.out.println(stringClass.isAnnotationPresent(MyAnnotations.class));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
//只允许该注解可以标注类，方法
@Target({ElementType.TYPE,ElementType.METHOD})
/**
 * 希望这个注解可以被反射
 * 保存Class文件		RetentionPolicy.RUNTIME
 * 保存java源文件		RetentionPolicy.SOURCE
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotations{
	String value() default "0X1216";
}
@interface myannota{
	String user();
	String password();
}