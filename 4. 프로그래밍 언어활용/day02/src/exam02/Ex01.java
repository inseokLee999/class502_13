package exam02;

public class Ex01 {//exam02.Ex01
    public static void main(String[] args) {
        Schedule s1=new Schedule();
        //s1.year=2024;
        //s1.month=4;
        //s1.day=16;//통제가 불가 하므로 지양
        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(15);
        s1.showDate();
        int month=s1.getMonth();
        System.out.println(month);
    }
}
