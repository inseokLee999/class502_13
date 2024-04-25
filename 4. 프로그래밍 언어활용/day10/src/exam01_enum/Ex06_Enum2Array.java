package exam01_enum;

import java.util.Arrays;

public class Ex06_Enum2Array {
    public static void main(String[] args) {
        Transportation[] trans = Transportation.values();
        System.out.println(Arrays.toString(trans));//[BUS, METRO, WALK]
    }
}
