package javase.advanced.反射机制.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Filed属性 {

	public static void main(String[] args) {
		try {
			Class studentClass = Class.forName("priv.xc.javase.advanced.反射机制.Class.Student");
			//获取类名
			System.out.println("完整类名:"+studentClass.getName());
			System.out.println("简类名:"+studentClass.getSimpleName());
			//getFields()返回的是所有公开的属性
			Field[] fields = studentClass.getFields();
			System.out.println(fields.length);
			Field f = fields[0];
			String fieldName = f.getName();
			System.out.println(fieldName);
			
			System.out.println("**********************************");
			
			//获取所有的field
			Field[] fs = studentClass.getDeclaredFields();
			System.out.println(fs.length);
			for (Field field : fs) {
				/**
				 * 获取修饰类型
				 * 		field.getModifiers();
				 * 			返回的修饰符是个数字
				 * 			修饰符的代号
				 * 				0	默认
				 * 				1	
				 * 				2	public
				 * 				3
				 * 				4	
				 */
				 int i = field.getModifiers();
				 String modifierString = Modifier.toString(i);
				 System.out.println(modifierString);
				//获取属性类型
				Class fieldType = field.getType();
				String typrName = fieldType.getSimpleName();
				System.out.println(typrName);
				//获取属性的名字
				System.out.println(field.getName());
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
