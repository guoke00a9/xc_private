package javase.macase.酒店管理系统;

public class main_测试类 {
    public static void main(String[] args) {
       // new UserInterface();
        int[] arr = {10,5,9,15,6};

        for (int i = 0; i < arr.length; i++) {
            int mix=i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]<arr[mix]) {
                    mix = j;
                }
            }
            if (mix!=i) {
                int temp;
                temp = arr[mix];
                arr[mix]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
