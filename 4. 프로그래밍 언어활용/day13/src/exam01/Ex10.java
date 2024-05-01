package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("name01","name02","name03","name04");
        Collections.shuffle(names);
        System.out.println(names);

        String max = Collections.max(names);//정렬 후 가장 마지막 요소
        String min = Collections.min(names);//정렬 후 가장 처음 요소
        System.out.printf("max = %s , min = %s",max,min);
    }
}
