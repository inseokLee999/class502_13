package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02_matches {
    public static void main(String[] args) {
        String str = "I like football and basketballs";

        Pattern p1 = Pattern.compile(".*ball.*");
        Matcher m1 = p1.matcher(str);

        boolean match = m1.matches();
        System.out.println(match);
    }
}
