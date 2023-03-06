package javase.advanced.object超类;

public class main_测试类 {
	public static void main(String[] args) {
		
		Student s1 = new Student(144,"统院");
		Student s2 = new Student(144,"统院");
		System.out.println(s1.equals(s2));
	}
}
class Student{
	int no;
	String school;

	public String toString() {
		return "学号：" + no + ", 所在学校：=" + school + "。";
	}

	public Student() {}
	public Student(int no,String school) {
		this.no=no;
		this.school=school;
	}
	public boolean equals(Object obj) {
		if (this == obj)return true;//两个对象内存地址相等，直接返回true
		/**
		 * obj为空，直接返回false，obj不能转型直接返回false，
		 * 因为obj对象没办法调no和schaool
		 */
		if (obj == null&&obj instanceof Student)return false;
		Student other = (Student) obj;
		return this.no == other.no && this.school.equals(other.school);
		//return no == other.no && Objects.equals(school, other.school);
	}
	
	
}
