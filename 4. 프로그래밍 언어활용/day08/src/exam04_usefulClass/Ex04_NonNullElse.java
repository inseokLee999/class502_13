package exam04_usefulClass;

import java.util.Objects;

public class Ex04_NonNullElse {
    public static void main(String[] args) {
        String str = null;
        str= Objects.requireNonNullElse(str,"");
        str.toUpperCase();//NullPointerException 발생
    }
}
