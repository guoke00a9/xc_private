package javase.advanced.反射机制;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Field				字段
 * Modifier				修饰符
 * Method				方法
 * Type					类型
 * parameter			参数
 * getDeclaredFields()	获得某个类的所有声明的字段
 * getSimpleName()		得到类的简写名称
 * @author Passerby
 *
 */
public class 反编译 {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();	
		try {
			Class studentClass = Class.forName("priv.xc.javase.advanced.反射机制.Class.Student");
			s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{\n");
			Field[] field = studentClass.getDeclaredFields();
			for (Field field2 : field) {
				s.append("\t");	
				s.append(Modifier.toString(field2.getModifiers()));
				s.append(" ");
				s.append(field2.getType().getSimpleName());
				s.append(" ");
				s.append(field2.getName());
				s.append(";\n");	
			}
			Constructor[] constructors = studentClass.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				s.append("\t");
				s.append(Modifier.toString(constructor.getModifiers()));
				s.append(" ");
				s.append(studentClass.getSimpleName());
				s.append("(");
				Class[] parameterTypes = constructor.getParameterTypes();
				for (Class parameterType : parameterTypes) {
					s.append(Modifier.toString(parameterType.getModifiers()));
					s.append(",");
				}
				if (parameterTypes.length > 0) {
					s.deleteCharAt(s.length()-1);
				}
				s.append("){\n\n\t}\n");
			}
			Method[] method = studentClass.getDeclaredMethods();
			for (Method method2 : method) {
				s.append("\t");
				s.append(Modifier.toString(method2.getModifiers()));
				s.append(" ");
				s.append(method2.getReturnType().getSimpleName());
				s.append(" ");
				s.append(method2.getName());
				s.append("(");
				Class[] parameterTypes = method2.getParameterTypes();
				for(Class parameterTypes2 : parameterTypes) {
					s.append(parameterTypes2.getSimpleName());
					s.append(",");
				}
				s.deleteCharAt(s.length()-1);
				s.append("){\n\n\t}\n");
			}
			s.append("}");
			System.out.println(s);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
