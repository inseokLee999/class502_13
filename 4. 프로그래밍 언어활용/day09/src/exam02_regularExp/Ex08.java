package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "AAA\n1234\nBBBB\n456\nCCCCC\nDDDDDD";
        //4글자로 구성된 단어
        //Pattern p1 = Pattern.compile("\\b....\\b");
        //Pattern p1= Pattern.compile("\\b.{4}\\b");//위 코드랑 같음
        //Pattern p1= Pattern.compile("\\b.{4}\\b");//4글자 이상
        Pattern p1= Pattern.compile("\\b.{4,5}\\b");//4글자 이상 5글자 이하
        //Pattern p1= Pattern.compile("\\b.{,4}\\b");//4글자 이하//java는 안되네
        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
