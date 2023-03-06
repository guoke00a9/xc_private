package javase.macase.注解;

import java.lang.reflect.Field;

public class main测试类 {

	public static void main(String[] args) {

		Class userClass;
		try {
			userClass = Class.forName("priv.xc.javase.macase.注解.User");
			if (userClass.isAnnotationPresent(Id.class)) {
				Field[] field = userClass.getDeclaredFields();
				boolean isOk = false;
				for (Field field2 : field) {
					if ("id".equals(field2.getName()) && "int".equals(field2.getType().getSimpleName())) {
						isOk = true;
						break ;
					}
				}
				if (!isOk) {
					throw new NoIdException("被Id注解的类中必须有一个int类型的属性！");
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
