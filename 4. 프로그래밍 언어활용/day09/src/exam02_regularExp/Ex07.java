package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex07 {
    public static void main(String[] args) {
        String str = "java one\njava two\njava three";
        Pattern p1 = Pattern.compile("^\\w+\\s",Pattern.MULTILINE);//여러줄 걸쳐 패턴 체크
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            System.out.println(m1.group());
        }
        //System.out.println(str);

    }
}
