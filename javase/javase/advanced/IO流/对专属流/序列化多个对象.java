package javase.advanced.IO流.对专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 参与序列化和反序列化必须实现SeriaLize接口。
 * 		SeriaLize起到一个标识作用
 * 		public interface Serializable {}
 * 		java虚拟机看到SeriaLize之后会自动生成一个序列号版本号。
 * 
 * 序列化版本号:
 * 		源代码改动之后，需要重新编译，编译之后生成了全新的字节码文件。
 * 		bingqieclass文件再次运行的时候，java虚拟机生成的序列化版本号也会发生相应的改变。
 * 
 * 		如果类名相同，JVM虚拟机会根据序列化版本号区分。
 * 		自动生成的序列化版本号，一旦确定之后后续不能进行修改。
 *  	只要修改，必然会重新编译，此时会生成新的序列化版本号。
 *  	虚拟机会认为这是一个全新的类。
 *  		
 *  最终结论:
 *  		凡是一类实现了SeriaLizable接口，建议给该类提供一个固定不变的序列化版本号。
 *  		这样，以后这个类既使修改了，但是版本号不变，虚拟机会认为这是同个类。
 * @author Passerby
 *
 */

public class 序列化多个对象 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		list.add(new User(111,"zhangsan"));
		list.add(new User(222,"lisi"));
		list.add(new User(333,"wangwu"));
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("序列化多个对象"));
			
			out.writeObject(list);
			
			out.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (out == null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
class User implements Serializable{
	
	/**
	 * transient关键字标识游离的，不参与序列化。
	 * 		private transient String name;
	 * 建议将序列化版本号手动写出来，不建议生成。
	 */
	private static final long serialVersionUID = 9920125L;
	private int no;
	private String name;
	private int age;
	private String addresss;
	public User() {
		super();
	}
	
	public User(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}