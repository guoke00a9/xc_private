package javase.advanced.IO流.对专属流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 参与序列化和反序列化必须实现SeriaLize接口。
 * 		SeriaLize起到一个标识作用
 * 		public interface Serializable {}
 * 		java虚拟机看到SeriaLize之后会自动生成一个序列号版本号。
 * @author Passerby
 *
 */
public class ObjectOutput序列化 {

	public static void main(String[] args) {

		Student s1 = new Student(111,"zhangsan");
		//序列化
		ObjectOutputStream oos = null;
		try {
			 oos = new ObjectOutputStream(new FileOutputStream("seriaLize"));
			 //序列化对象
			 oos.writeObject(s1);
			 oos.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}

class Student implements Serializable{
	
	int no;
	String name;
	
	public Student() {
	}
	
	public Student(int no, String name) {
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
