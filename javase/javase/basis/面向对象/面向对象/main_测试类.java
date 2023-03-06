package javase.basis.面向对象.面向对象;



@SuppressWarnings("unused")
public class main_测试类 {
	public static void main(String[] args) {
		//User类测试
		/*
		User u = new User();
		u.no=11;
		u.name="王杰";
		u.addr=new Address();
		u.addr.city="牛逼大队亘庄";
		System.out.println("用户编号是："+u.no+"，用户姓名是"+u.name+"，家庭住址是："+u.addr.city);
		*/
		
		//Student测试类
		/*
		Studen是引用数据类型
		s是变量
		new Student（）是一个学生对象
		Student s = new Student();
		int no=10;
		s.setNo(no);
		System.out.println(s.getNo());
		*/
		
		//类测试
		//引用类型的变量mqx
		Female mqx = new Female();
		mqx.name="孟清选";
		
		Male wj = new Male();
		wj.name="王杰";
		
		wj.f=mqx;
		mqx.m=wj;
		
		//Male ghh = new Male();
		//ghh.name="顾贺贺";
		//ghh.f=new Female();
		//ghh.f.name="贾亚鑫";
		System.out.println(wj.name+"的对象是："+wj.f.name);
		System.out.println(mqx.name+"的对象是："+mqx.m.name);
		//System.out.println(ghh.name+"的对象"+ghh.f.nam);
		
		
		
	}

}
