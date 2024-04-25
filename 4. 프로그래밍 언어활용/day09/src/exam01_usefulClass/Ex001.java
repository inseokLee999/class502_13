package exam01_usefulClass;

import java.util.Arrays;

public class Ex001 {
    public static void main(String[] args) {
        int total1=add(10,20,30,40);
        int total2=add(10,20,30);
        System.out.printf("total1= %d , total2=%d %n",total1,total2);
        names("이름1","이름2","이름3");
    }
    public static int add(int... nums){
        int total=0;
        for(int num:nums){
            total+=num;
        }
        return total;
    }

    public static void names(String... names) {
        System.out.println(Arrays.toString(names));

    }
}
