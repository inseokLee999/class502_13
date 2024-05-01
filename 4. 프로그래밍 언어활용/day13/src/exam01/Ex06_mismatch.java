package exam01;

import java.util.Arrays;

public class Ex06_mismatch {
    public static void main(String[] args) {
        String[] fruits1={"사과","오렌지","망고","멜론"};
        String[] fruits2 = {"사과","오렌지","바나나","포도"};
        int pos = Arrays.mismatch(fruits1,fruits2);//동일하면 -1
        System.out.println(pos);
        Arrays.sort(fruits1);
        System.out.println(Arrays.toString(fruits1));
    }
}
