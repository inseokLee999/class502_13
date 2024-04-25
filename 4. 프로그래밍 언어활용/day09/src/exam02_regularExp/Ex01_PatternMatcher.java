package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01_PatternMatcher {
    public static void main(String[] args){
        String str = "I like football and basketball";

        Pattern p1 = Pattern.compile("ball");
        Matcher m1 = p1.matcher(str);
        System.out.println(m1.find());//football
        System.out.println(m1.group());//패턴에 일치하는 문자열
        System.out.println(m1.find());//basketball
        System.out.println(m1.group());
        System.out.println(m1.find());//false
    }
}
