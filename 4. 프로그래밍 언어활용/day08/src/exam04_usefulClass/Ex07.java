package exam04_usefulClass;

import java.util.HashSet;

public class Ex07 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("이름1");
        names.add("이름1");
        names.add("이름4");
        names.add("이름3");
        names.add("이름2");
        names.add("이름5");

        System.out.println(names);
    }
}
