package day02.interfaceex;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();
        X xClass = mClass;
        xClass.x();
        Y yClass = mClass;
        yClass.y();

        MyInterface myInterface = mClass;
        myInterface.myMethod();
        myInterface.x();
        myInterface.y();
    }
}
