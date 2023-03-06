package javase.advanced.object超类;

/**
 * equals方法的源代码
 * public boolean equals(Object obj){
 * 	return (this=obj);
 * }
 * @author 王爸爸
 *	判断基本数据类型是否相等用“==”
 *	判断java对象是否相等则使用equals方法
 *
 *	
 */
public class Object_equals {
	public static void main(String[] args) {
		Person p1 = new Person("王杰",18);
		Person p2 = new Person("王杰",18);
		
		String s1 = "111";
		String s2 = "111";
		String s3 = new String("111");
		String s4 = new String("111");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		//System.out.println(p1==p2);//输出false，用==判断的是对象的内存地址
		System.out.println(p1.equals(p2));
		
	}
}
class Person{
	
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	/**
	 * 优化后
	 */
	public boolean equals(Object obj) {
		
		if (obj==null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		String name1 = this.name;
		int age1 = this.age;
		Person person = (Person)obj;
		String name2 = person.name;
		int age2 = person.age;
		if (name1 == name2 && age1 == age2) {
			return true;
		}
		return false;
		
		
		
		
		
		
		
		
		/**
		 * 以下代码执行效率低
		 */
		//获取第一个对象的姓名年龄
		//String name1 = this.name;
		//int age1 = this.age;
		
		//获取第二个对象的姓名年龄
		/**
		 * instabceof左边是对象，右边是类或者子类
		 * 左边的对象能转则转向右边的类型   不能转就不转
		 */
		/*
		if (obj instanceof Person) {
			Person person = (Person)obj;
			String name2 = person.name;
			int age2 = person.age;
			if (name1 == name2 && age1 == age2) {
				return true;
			}
		}
		return false;
	*/
	}
}