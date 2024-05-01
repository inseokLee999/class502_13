package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_Arrays2Arraylist {
    public static void main(String[] args) {
        //변경 불가 리스트
        List<String> names = Arrays.asList("이름1","이름2","이름3");
//        names.remove(0);
        System.out.println(names);
        //변경이 필요한 경우는 List 의 구현 클래스의 객체 생성시 생성자 매개 변수로 대입
        List<String> names2 = new ArrayList<>(names);
        names2.remove(0);
        System.out.println(names2);
    }
}
