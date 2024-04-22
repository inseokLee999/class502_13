package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Schedule2 s1=new Schedule2();
        /*
        s1.setDay(15);
        s1.setYear(2024);
        s1.setMonth(4);

         */
        System.out.println(s1.toString()); // s1.toString()
        System.out.println(s1);
        System.out.println(System.identityHashCode(s1));
        s1.printThis();
    }
}
