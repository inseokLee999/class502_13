package exam02;

public class Outer2 {
    int num1=10;
    static int num2=20;
    static class Inner{
        void method(){
            System.out.println("정적 내부 클래스");
//            System.out.println(Outer2.this.num1); static method이기 때문에 접근 불가
            System.out.println(num2);
        }
    }
}
