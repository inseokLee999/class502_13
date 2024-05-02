package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        String[] fruits = {"apple","orange","mango","melon"};
        /**
         * 1. 문자열 앞뒤로 *...*
         * 2. 대문자 변환
         * 3. 출력
         */
        Arrays.stream(fruits).map(s->"*"+s+"*")
                            .map(String::toUpperCase)
                            .forEach(System.out::println);
    }
}
