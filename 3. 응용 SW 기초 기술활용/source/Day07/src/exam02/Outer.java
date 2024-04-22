package exam02;

public class Outer {
    int num1=20;
    class Inner{
        int num1=30;
        void method(){
            System.out.println(num1);
            System.out.println(Outer.this.num1);
        }
    }
}
