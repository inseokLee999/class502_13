package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores = {92,88,83,85,96};

        int total = Arrays.stream(scores).reduce(0,(n1,n2)->{
            System.out.printf("n1: %d , n2 : %d\n",n1,n2);
            n1+=n2;
            return n1;
        });

        System.out.println(total);
    }
}
