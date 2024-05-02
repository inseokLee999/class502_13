package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08_chain {
    public static void main(String[] args) {
        int [] nums = {22,11,10,2,6,8,33};
//        Arrays.stream(nums).map(x->x*x).filter(x->x%2==1).forEach(System.out::println);

        IntStream stm1 = Arrays.stream(nums);
        IntStream stm2 = stm1.map(x->x*x);
        IntStream stm3 = stm2.filter(x->x%2==1);
    }
}
