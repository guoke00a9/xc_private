package javase.advanced.Random随机数;

import java.util.Random;

public class 随机数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//创建随机数对象
		Random random = new Random();
		//随机产生一个int类型取值范围内的数字。
		int num = random.nextInt();
		System.out.println(num);
		
		/**
		 * 产生[0-100]之间的随机数，不能产生101
		 * nextInt翻译为：下一个int类型的数据是101，表示只能渠道100.
		 */
		int num1 = random.nextInt(101);
		System.out.println(num1);
	}

}
