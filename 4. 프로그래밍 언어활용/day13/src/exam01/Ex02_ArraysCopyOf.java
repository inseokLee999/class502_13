package exam01;

import java.util.Arrays;

public class Ex02_ArraysCopyOf {
    public static void main(String[] args) {
        int[] nums1 = {10,20,30,40,50,60};
        int[] nums2 = Arrays.copyOf(nums1,3);
        int[] nums3 = Arrays.copyOfRange(nums1,1,5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}
