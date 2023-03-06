package javase.macase.单链表.数组;
public class practice_数组遍历案例 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,8,3,5,2};
		System.out.print("冒泡排序前：");
		printArray(arr);   //打印数组元素
		bubbleSort(arr);   //调用排序方法
		System.out.print("冒泡排序后：");
		printArray(arr);}
	//定义打印数组元素的方法
	public static void printArray(int[] arr01) {
		for(int i =0;i<arr01.length;i++) {
			System.out.print(arr01[i]+" ");//打印元素和空格
		}
		System.out.print("\n");
	}
	//定义对数组排序的方法
	public static void bubbleSort(int[] arr) {
		//定义外层循环    {9 8 3 5 2}
		// 8 9 3 5 2   8 3 9 5 2   8 3 5 9 2   8 3 5 2 9
		// 3 8 5 2 9   3 5 8 2 9   3 5 2 8 9
		// 3 5 2 8 9   3 2 5 8 9
		// 2 3 5 8 9
		for(int i = 0;i<arr.length;i++) {
			//定义内层循环
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序后：");
			printArray(arr);     //每轮比较结束后打印数组元素
		}
	}
}