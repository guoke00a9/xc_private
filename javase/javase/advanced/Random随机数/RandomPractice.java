package javase.advanced.Random随机数;

import java.util.Random;

/**
 * 随机产生5个不同的数字
 * 要求使用数组
 */
public class RandomPractice {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] arr = new int[5];
		//数组每个元素初始化值-1
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		/**
		 * 循环条件
		 * 		当赋值次数小于数组大小
		 * 			
		 * 结束条件
		 * 		当赋值次数大于等于数组大小
		 */
		int index = 0;
		while (index < arr.length) {
			//随机产生0-101的数字
			int num = random.nextInt(6);
			/**
			 * 判断数组中是否有产生的随机数
			 * 		有则跳过赋值继续循环
			 * 			返回true不赋值
			 * 		没有则给数组赋值
			 * 			返回false赋值
			 */
			if(!ifrandom(arr, num)) {
				arr[index++] = num;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	/**
	 * 
	 * @param arr 数组
	 * @param num 随机数
	 * @return true表示包含， false表示不包含。
	 */
	public static boolean ifrandom(int[] arr,int num) {
		/**
		 * 以下方案有bug
		 * //对数组进行升序排列
		 * Arrays.sort(arr);
		 * //二分法查找
		 * //二分法查找的结果>=0说明找到了这个元素，表示包含。
		 * return Arrays.binarySearch(arr,num)>=0;
		 */
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				//条件成立代表包含
				return true;
			}
		}
		//程序执行到此处代表不包含
		return false;
	}
}
