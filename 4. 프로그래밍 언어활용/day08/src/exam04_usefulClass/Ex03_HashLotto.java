package exam04_usefulClass;

import java.util.Arrays;
import java.util.HashSet;

import static java.lang.Math.random;

public class Ex03_HashLotto {
    public static void main(String[] args) {
        //set : 중복 X
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size()<25){
            lotto.add(getNumber());
        }
        System.out.println(lotto);
    }
    public static int getNumber(){
        return (int) (random()*45)+1;
    }
}
