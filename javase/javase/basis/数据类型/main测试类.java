package javase.basis.数据类型;
/**
 * 		基本数据类型			引用数据类型
 * 			byte				java.lang.Byte
 * 			short				java.lang.Short
 * 			int					java.lang.Integer
 * 			long				java.lang.Long
 * 			double				java.lang.Double
 * 			float				java.lang.Float
 * 			boolean				java.lang.Boolean
 * 			char				java.lang.Character
 */

/**
 * int String Integer
 * 		int --> String
 * 			数字+""
 * 			String.valueOf("值");
 * 				String i1 = 100+"";
 * 				 
 * 		String --> int
 * 			Integer.parseInt("值");
 * 				int i2 = Integer.parseInt("100");
 * 		int --> Integer
 * 			自动装箱
 * 				Integer I3 = 100;
 * 			Integer.valueOf（值）;
 * 				Integer i3 = Integer.valueOf(100);
 * 		Integer --> int
 * 			自动拆箱
 * 				int i4 = i3;
 * 			intValue();
 * 				int i4 = i3.intValue();
 * 		Integer --> String
 * 			Integer.valueOf（"值"）;
 * 				Integer I5 = Integer.valueOf("100");
 * 		String --> Integer
 * 			String i6 = String.valueOf(i5);
 * 		
 * @author 王爸爸
 *
 */
public class main测试类{
	public static void main(String[] args) {
		
		/**
		 * 出现横线表示已经过时
		 * 123：基本数据类型
		 * 通过构造方法的包装达到了：基本数据类型转换引用数据类型
		 * （int --> Integer）
		 */
		Integer integer = new Integer(100);
		
		//将引用数据类型转换为基本数据类型
		float f = integer.floatValue();
		System.out.println(f);
		
		/**
		 * 将String类型的数字，转换成Integer
		 * （String --> Integer）
		 */
		Integer integer1 = new Integer("1000");
		System.out.println(integer1);
		
		/**
		 * 通过访问包装类的常量获取最大值最小值
		 */
		System.out.println("int最大值"+Integer.MAX_VALUE);
		System.out.println("int最小值"+Integer.MAX_VALUE);
		System.out.println("byte最大值"+Byte.MAX_VALUE);
		System.out.println("byte最小值"+Byte.MAX_VALUE);
		System.out.println("------------------------------------------");
		
		/**
		 * jdk15
		 * 		自动拆箱和装箱
		 * 			自动装箱
		 * 				int --> Integer
		 * 			自动拆箱
		 * 				Integer --> int
		 */
		
		Integer x = 100;
		int xx = x;
		System.out.println(xx);
		
		Integer aInteger = 100;
		Integer bInteger = 100;
		/**
		 * + - * "/"会触发自动拆箱机制
		 */
		System.out.println(aInteger == bInteger);
		
		//String 自动转换 int
		int r = Integer.parseInt("100");
		System.out.println(r);
		
		/**
		 * valueOf方法作为了解
		 */
		Integer i1 = Integer.valueOf(100);
		System.out.println(i1);
		Integer i2 = Integer.valueOf("100");
		System.out.println(i2);
		//--------------------------了解---------------------------/
		//静态的：将十进制转换成二进制
		System.out.println(Integer.toBinaryString(10));
		//静态的：将十进制转换成十六进制
		System.out.println(Integer.toHexString(17));
	}
}
