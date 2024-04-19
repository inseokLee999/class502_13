package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad=new D();
        A ac=new C();
        B b=new B();
        A a=new A();
        b.numA=15;
        System.out.println(b.numA);
        System.out.println(a.numA);
        if(ad instanceof C) {
            C c = (C) ad;
        }
        if(ac instanceof C) {
            C cc = (C) ac;
            System.out.println(cc.numA);
        }
    }
}
