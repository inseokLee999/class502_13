package exam02;

public class Ex02 {
    public static void main(String[] args) {
//        C c=new C();
//        A a=c;
        A ad=new D();
        A ac=new C();

        if (ad instanceof C){
            C c=(C)ad;
        }
        if (ac instanceof C){
            C c=(C)ac;
        }
//        D ac;
//        System.out.println("c:"+System.identityHashCode(c));
//        System.out.println("a:"+System.identityHashCode(a));
//        B b=c;
//        A a=new C();
    }
}
