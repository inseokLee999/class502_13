package exam02;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<String> names= new HashSet<>();
        names.add("이름1");
        names.add(new String("이름1"));
        names.add("이름2");
        names.add("이름3");

        System.out.println(names);
    }
}
