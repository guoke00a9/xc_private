package javase.advanced.注解;

public class 注解的使用 {

	public static void main(String[] args) {

	}

	@OtherAnnotation(age = 25,email = {"zhangsan@123.com","lisi@123.com"},seasonArray = Season.SPRING)
	public static void doSome() {}
	//只有一个元素，大括号可以省略
	@OtherAnnotation(age = 25,email = "zhangsan@123.com",seasonArray = {Season.SUMMER,Season.SPRING})
	public static void doOther() {}
}
@interface OtherAnnotation{
	/**
	 * 年龄属性
	 * @return
	 */
	int age();
	
	/**
	 * 邮箱地址属性，支持多个
	 */
	String[] email();
	
	/**
	 * 季节数组，Season是枚举类型
	 */
	Season[] seasonArray();
}
enum Season{
	AUTUMN,
	SPRING,
	SUMMER,
	WINTER
}