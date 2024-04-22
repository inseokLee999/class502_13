package day01;

public class Ex02 {
    public static void main(String[] args) {
        C c=new C();// C->B,A 자동 형변환( 다형성)
        A a=c;
        B b=c;
        A ac=new C();

    }
}
