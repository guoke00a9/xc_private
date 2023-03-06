package javase.advanced.数字格式化异常;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class main测试类 {
	public static void main(String[] args) {
		
		/**
		 * java.text.DecimalFormat专门负责数字格式化的
		 * new DecimalFormat("数字格式");
		 * 		数字格式
		 * 		#代表任意数字
		 * 		,代表千分位
		 * 		.代表小数点
		 * 		0代表不够时补0
		 */
		DecimalFormat df = new DecimalFormat("###,###.##");
		String s = df.format(124444434.45);
		System.out.println(s);
		
		//保留4个小数位不够时补0
		DecimalFormat df1 = new DecimalFormat("###,###.0000");
		String s1 = df1.format(1234.56);
		System.out.println(s1);
		
		//**************************************************************************/
		/**
		 * BigDecimal属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
		 * 这是SUN提高的一个类，专门用在财务软件当中。
		 * 注意：财务软件中double是不够用的。
		 */
		//精度极高的100和200
		BigDecimal bg = new BigDecimal(100);
		BigDecimal bg1 = new BigDecimal(200);
		//加
		BigDecimal bg2 = bg.add(bg1);
		System.out.println(bg2);
		//减
		//BigDecimal bg5 = bg1.
		//乘
		//除
		BigDecimal bg5 = bg1.divide(bg);
		System.out.println(bg5);
	}
}
