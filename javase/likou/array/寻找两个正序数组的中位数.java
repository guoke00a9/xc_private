package likou.array;

import java.util.ArrayList;
import java.util.Arrays;

public class 寻找两个正序数组的中位数 {
    public static void main(String[] args) {

        int[] arr1 = {1,3};
        int[] arr2 = {2};
        int[] arr3 = addArr(arr1, arr2);
        double v = decMedian(arr3);
        System.out.println(v);
    }

    public static int[] addArr(int[] nums1, int[] nums2){
        if(nums1.length == 0)
            return nums2;
        if(nums2.length == 0)
            return nums1;
        int[] nums3 = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums3.length; i++) {
            if (i >= nums1.length) {
                nums3[i] = nums2[i - nums1.length];
            }else {
                nums3[i] = nums1[i];
            }
        }
        Arrays.sort(nums3);
        return nums3;
    }

    public static double decMedian(int[] nums){
        if(nums.length == 1 )
            return nums[0];
        if (nums.length % 2 == 1) {
            return nums[nums.length / 2];
        }else {
            int median = nums.length / 2;
            median = nums[median] + nums[median-1];
            if ( median <= 0){
                return 0.00000;
            }else {
                return median / 2.0;
            }
        }
    }

}
