package javase.macase.单链表.数组;

public class practice_选择排序 {
	public static void main(String[] args) {
		int[] arr = {10,5,9,15,6};
		
		/**
		 * 第一个循环控制循环5次
		 * 第二个循环控制比较4次
		 * mix变量表示假设最小值下标：10
		 */
		for (int i = 0; i < arr.length; i++) {
			int mix=i;
			for (int j = i+1; j < arr.length; j++) {
				/**
				 * 当有元素小于假设的最小值时
				 * 替换最小值下标
				 * 第一次循环mix=5
				 */
				if (arr[j]<arr[mix]) {
					mix = j;
				}
			}
			if (mix!=i) {
				int temp;
				temp = mix;
				arr[i]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
