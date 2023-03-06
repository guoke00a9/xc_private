package javase.advanced.集合.cllection.list;

import java.util.ArrayList;

/**
 * JDK5.0之后推出的新特性：
 * 		增强for循环【foreach】
 * @author 王爸爸
 *
 */
public class foreach循环 {

	public static void main(String[] args) {
		
		/*
		String s = new String("1") + new String("1");
		String s1 = s.intern();
		String s2 = "11";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s == s1);
		System.out.println(s2 == s1);
		System.out.println(s2 == s);
		
		Object oo = "sss";
		System.out.println(oo);//输出结果为sss
		*/
		
		/**
		 * 增强for（foreach）:
		 * 		for(元素类型 变量名:数组或集合){
		 * 			System.out.println(变量名);
		 * 		}
		 * 
		 * 		缺点：没有下标，在需要使用下标的循环中不建议使用增强for(foreach)。
		 * 
		 */
		ArrayList list = new ArrayList();
		list.add("王杰");
		list.add("王烨");
		list.add("王声阳");
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
