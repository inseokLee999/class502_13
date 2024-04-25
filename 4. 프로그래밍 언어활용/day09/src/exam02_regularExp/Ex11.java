package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {
    public static void main(String[] args) {
        String str = "ABCABCABC";
        //Pattern p1 = Pattern.compile("ABC{3}");//ABCCC
        Pattern p1 = Pattern.compile("(ABC){3}");//ABCABCABC
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
    }
}
