package day02.innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;

    private InClass inclass;

    public OutClass(){
        inclass = new InClass();
    }
    class InClass {
        int inNum = 100;
        static int sNum = 20;


        void inTest() {
            System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수");
            System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적변수");
        }
    }
        public void usingClass(){
            inclass.inTest();
        }

}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingClass();
    }
}
