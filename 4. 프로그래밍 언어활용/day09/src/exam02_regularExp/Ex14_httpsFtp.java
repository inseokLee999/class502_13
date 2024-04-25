package exam02_regularExp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex14_httpsFtp {
    public static void main(String[] args) {
        String str1="https://www.naver.com";
        String str2="ftp://www.naver.com";
        String[] strs={str1,str2};
        Pattern p1 = Pattern.compile("\\w*(?=:)");
        for (String str: strs){
            Matcher m1 = p1.matcher(str);
            while(m1.find()){
                System.out.println(m1.group());
            }
        }
    }
}
