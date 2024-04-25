package exam02_regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex13_phoneNums {
    public static void main(String[] args) {
        String str="이이름: 010-0000-0000\n김이름: 010-1111a1111";
        Pattern p1 = Pattern.compile("([^:]+):\\s*(01[016][-_.]?\\d{3,4}-?\\d{4})");

        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            System.out.printf("이름 : %s, 전화번호: %s%n",m1.group(1).replace("\n",""),m1.group(2));
        }
    }
}
