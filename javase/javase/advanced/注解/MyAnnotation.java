package javase.advanced.注解;

public class MyAnnotation {

	public static void main(String[] args) {

		/**
		 * * 如果一个注解当中有属性，那么必须给属性赋值
		 * @MyAnnotation
		 * public void doSome(){
		 * }
		 */
	}
	@MyAnnotationn(name = "wangjie",age = 20,value = "111")
	public void doSome(){}
	//如果注解中的属性是且只有一个value可以不写属性名
	@ma("1")
	public void doOther() {}
}
@interface MyAnnotationn{
	
	/**
	 * 通常在注解当中可以定义属性，一下这个是MyAnnotation的name属性
	 * 看着像一个方法，但实际上我们称之为属性name
	 */
	String name();
	/**
	 * 给定默认值则不用赋值
	 * int age() default 20;
	 */
	int age();
	String value();
}
@interface ma{
	/**
	 * 注解当中的属性可以byte short int lang double boolean char Class
	 * 以及以上的每一种数组形式	 枚举 String 
	 * @return
	 */
	String value();
}
