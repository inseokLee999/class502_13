package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40};

        /*
        for (int num:nums){ //향상된 for 문
            System.out.println(num);
        }
         */
        IntStream.range(0,nums.length).forEach(i-> System.out.println(nums[i]));
        System.out.println(Arrays.toString(nums));
    }
}
