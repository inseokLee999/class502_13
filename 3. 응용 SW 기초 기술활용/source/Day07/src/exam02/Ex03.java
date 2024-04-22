package exam02;

import exam01.Calculator;

public class Ex03 {
    public static void main(String[] args) {
        Outer3 out=new Outer3();
        Calculator cal= out.method();
        int result=cal.add(10,20);
        System.out.println(result);
    }
}
