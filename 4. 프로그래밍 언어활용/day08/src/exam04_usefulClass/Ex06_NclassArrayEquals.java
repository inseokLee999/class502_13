package exam04_usefulClass;

import java.util.Arrays;

public class Ex06_NclassArrayEquals {
    public static void main(String[] args) {
        int[][][] num1={{{10, 20}, {30, 40}},{{50, 60},{70, 80}}};
        int[][][] num2={{{10, 20}, {30, 40}},{{50, 60},{70, 80}}};
        System.out.println(Arrays.deepEquals(num1,num2));

    }
}
