package exam10;

public class Outer {
    int num1=10;
    class Inner{//인스턴스 내부 클래스 인스턴스 자원과 동일 Outer 가 객체가 되어야 함
        int num2=20;
        int num1=15;
        static int num3=40;
        public void method(){
            System.out.println("Method in Inner");
            System.out.println(Outer.this.num1);
            System.out.println(num1+num2+num3);
        }
    }
}
