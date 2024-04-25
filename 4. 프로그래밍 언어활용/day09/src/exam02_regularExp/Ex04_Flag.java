package exam02_regularExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04_Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요 : ");
        String str=sc.nextLine();

        //Pattern p1 = Pattern.compile("[a-zA-z]");//A 부터 z 까지 - 문자 메타 문자 문자의 범위를 설정해 주는 범위문자
        Pattern p1 = Pattern.compile("[a-z]",Pattern.CASE_INSENSITIVE);//알파벳 대소문자 구분 없이 체크
        Matcher m1 = p1.matcher(str);

        if(!m1.find()){
            System.out.println("알파벳이 포함되지 않았습니다.");
        }
    }
}
