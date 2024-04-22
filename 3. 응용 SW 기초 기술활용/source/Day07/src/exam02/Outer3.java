package exam02;

import exam01.Calculator;

public class Outer3 {
    Calculator method(){
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
    /*
    void method(int num1) {
        class Inner {
            void method() {
                System.out.println("지역 내부 클래스"+num1);
            }
        }
        Inner in= new Inner();
        in.method();
        */
    }
}
