package javase.macase.精华平台;

public class JHutil {

	public static int[] replace(String[] arr) {
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		return intArr;
	}
}
