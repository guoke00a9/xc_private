package javase.advanced.集合.Map.Map.HachMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class 重写Equals和toString {

	public static void main(String[] args) {

		Student s1 = new Student("亚索");
		Student s2 = new Student("亚索");
		System.out.println(s1.equals(s2));
		//重写hashCode方法之前的哈希值
		System.out.println("s1的hashCode="+s1.hashCode());//s1的hashCode=305808283
		System.out.println("s2的hashCode="+s2.hashCode());//s2的hashCode=2111991224
		
		Set<Student> students = new HashSet<>();
		/**
		 * 重写HashCode之前值不同  可以存放
		 */
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
	}

}

class Student{
	
	private String name;

	
	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int hashCode() {
		return Objects.hash(name);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	
}