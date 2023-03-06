package javase.basis.面向对象.面向对象;


/*学生类是一个模板
描述了所有学生的共同特征｛状态+行为｝
当前类只描述学生的状态信息

类体+属性+方法
属性（存储数据采用变量的形式）
由于变量定义在类体房中，方法体之外，这种变量被称为成员变量   所有学生都有学号信息
但是每一个学生学号都是不同的，所以要访问这个学号必须先创建对象，通过对象去访问学号信息
学号信息不能直接通过“类”去访问，所以这种成员变量又被叫做：实例变量 对象又被称为实例，实例对象又被称为对象变量，（对象级别的变量）

不创建对象，这个（no）变量的内存空间是不存在的，只有创建了对象，这个no变量的内存空间才会创建  
 */

//new运算符的作用是创建对象，在JVM堆内存当中开辟新的内存空间
//方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间中
//棧内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在棧内存中压棧
//堆内存：new的对象在堆内存中存储

public class Student
{
	/**构造器:就是创建对象
	 * 构造器与类名相同
	 * 一个类有一个或者多个构造器
	 * 构造器没有返回值 
	 * 当一个类没有没有构造方法  编译器 会默认生成一个无参构造
	 */
	
	//学号
	private int no; 
	//姓名
	private String name;
	//年龄
	private int age;
	//地址
	private String addr;
	
	//提供公共的get方法
	//get方法获取属性值
		
	//提供公共的set方法
	//set方法
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no=no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getAddr() {
		return addr;
	}
	public void setArry(String addr) {
		this.addr=addr;
	}
}