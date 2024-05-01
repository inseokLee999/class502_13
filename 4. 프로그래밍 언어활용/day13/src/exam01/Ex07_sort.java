package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07_sort {
    public static void main(String[] args) {
        Integer [] nums = {22,10,5,1,99,49};
        //Arrays.sort(nums);//기본 정렬 기준 - java.lang.comparable, int CompareTo()
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));

    }
}
