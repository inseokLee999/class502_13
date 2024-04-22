package Test0417;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //다음 배열의 순서를 반대로 정렬해 보세요.
        //int[] nums = { 21, 22, 30, 11, 99, 31 };
        int[] nums = { 21, 22, 30, 11, 99, 31 };
        System.out.println("원래 배열 : "+Arrays.toString(nums));

        for(int i=0;i<(nums.length/2);i++){
            int temp=nums[i];
            nums[i]=nums[(nums.length)-i-1];
            nums[nums.length-i-1]=temp;
        }
        System.out.println("반대로 정렬한 배열 : "+Arrays.toString(nums));
    }
}
