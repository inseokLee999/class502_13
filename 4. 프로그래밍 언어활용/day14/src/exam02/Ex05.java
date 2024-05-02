package exam02;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = {4,7,1,2,7,6,3,9,10};

        IntStream stm = Arrays.stream(nums);
        int total = stm.map(x->x*x).sum();
        System.out.println(total);
        stm = Arrays.stream(nums);
        int total2 = stm.map(x->x*x*x).sum();
        System.out.println(total2);
    }
}
