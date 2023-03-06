package likou.array;

import javase.basis.java工具.数组遍历;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class 找出数组中两个值相加等于源值 {
    public static void main(String[] args) {

        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        int num1 = 9;
        int num2 = 6;

        数组遍历.遍历(getIndex(nums1, num1));
        数组遍历.遍历(getIndex(nums2,num2));
        数组遍历.遍历(getIndex(nums3,num2));
    }

    public static int[] getIndex(int[] nums,int target){
        long s = new Date().getTime();
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            for (int j = i+1; j < len; ++j) {
                if (nums[i] + nums[j] == target) {
                    long e = new Date().getTime();
                    System.out.println("运行时间"+(s - e));
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
