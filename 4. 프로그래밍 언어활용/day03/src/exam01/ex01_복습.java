package exam01;

public class ex01_복습 {
    public static void main(String[] args) {
        Schedule s1=new Schedule();
//        s1.year=2024;
//        s1.month=4;
//        s1.day=17;
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(30);

        s1.showDate();
        s1.printThis();
        System.out.println(s1);
        System.out.println(s1.returnThis()==s1);
    }
}
