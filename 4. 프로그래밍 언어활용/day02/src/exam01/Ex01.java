package exam01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.showInfo();
        student1.Student_id=1000; //인스턴스 변수
        student1.name="이정후";
        student1.subject="야구";
        student1.showInfo();
        student1.study();
        Student s2=new Student();
        s2.Student_id=1001;
        s2.name="손흥민";
        s2.subject="축구";
    }
}
