package javase.macase.单链表.数组;

import javase.basis.java工具.数组遍历;

import java.util.Arrays;


public class practice_二分法查找 {
	public static void main(String[] args) {
		
		int[] arr = {9,55,95,6,3,1};
		Arrays.sort(arr);
		/**
		 * 需求：找到6的下标如果没有返回-1
		 */
		/*
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==6) {
				System.out.println("6的下标是："+i);
				return;
			}
		}
		//程序执行到此处表示没有找到6
		System.out.println("6不存在该数组元素");
		*/
		
		//以上程序最好封装一个方法
		数组遍历.遍历(arr);
		//find返回查找的索引值
		int index = find(arr, 3);
		System.out.println(index == -1 ? "该元素下标不存在" : "该元素下标是"+index);
		
	}
	/**
	 * 方法功能：查找
	 * 参数：数组和被查找的元素值
	 * 返回值：被查找的下标
	 * 一个一个找效率慢
	 */
	/*
	public static int find(int[] arr,int x) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
		
	}
	*/
	/**
	 * 
	 * @param arr 数组
	 * @param x 被索引值
	 * @return 返回下标
	 */
	public static int find(int[] arr,int x) {
		//开始下标
		int begin = 0;
		//结束下标
		int end = arr.length - 1;
		
		while(begin <= end) {
			//中间下标
			int mid = (begin + end) / 2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x){
				//如果目标在“中间元素”的右边
				//开始元素下标需要发生变化（开始元素的下标需要重新赋值）
				begin = mid +1;
			}else {
				//如果目标在“中间元素”的左边
				//结束元素下标需要发生变化（结束元素的下标需要重新赋值）
				end  =  mid -1;
			}
		}
		return -1;
		
	}
}
