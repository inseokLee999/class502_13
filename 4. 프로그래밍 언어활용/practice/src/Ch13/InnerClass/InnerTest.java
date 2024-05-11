package Ch13.InnerClass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
    class InClass {
        int inNum = 100;
        static int sInNum = 200;
        void inTest(){
            System.out.println("Outclass num = " + num+"(외부클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = "+sNum+"(외부클래스의 정적 변수");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }
}

public class InnerTest{
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부클래스 이ㅛㅇ하여 내부클래스 기능 호출 ") ;
        outClass.usingClass();
    }
}
