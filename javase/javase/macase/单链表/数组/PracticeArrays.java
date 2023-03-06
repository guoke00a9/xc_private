package javase.macase.单链表.数组;

import java.util.Arrays;

public class PracticeArrays {
	public static void main(String[] args) {
		int[] arr = {100,200,300};
		//升序排列数组
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int index = Arrays.binarySearch(arr, 200);
		System.out.println(index == -1 ? "该元素不存在":"该元素下标："+index);
	}
}
