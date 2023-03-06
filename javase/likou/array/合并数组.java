package likou.array;

import javase.basis.java工具.数组遍历;

import java.util.Arrays;

public class 合并数组 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3,n = 3;
        merage(nums1,m,nums2,n);
        数组遍历.遍历(nums1);
}
    public static void merage(int[] nums1,int m,int[] nums2,int n){
//        if (num2 == 0)  return;
//        if (num2 != 0 && num1 == 0){
//            for (int i = 0; i < nums2.length; i++) {
//                nums1[i] = nums2[i];
//            }
//            return;
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            nums1[num1+i] = nums2[i];
//        }
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
