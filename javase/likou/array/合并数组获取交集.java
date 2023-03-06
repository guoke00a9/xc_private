package likou.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 合并数组获取交集 {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set1 = new HashSet();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            if (!set1.add(i)) {
                list.add(i);
            }
        }

        for (int i : nums2) {
            if (!set1.add(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
