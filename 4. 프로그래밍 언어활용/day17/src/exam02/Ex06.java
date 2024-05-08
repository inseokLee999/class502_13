package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date2 = today.plus(150, ChronoUnit.DAYS);
        LocalDate date3 = today.minus(150,ChronoUnit.DECADES);

        System.out.println("오늘 : " +today);
        System.out.println("150일 후 : "+date2);
        System.out.println("1500년 전 : "+ date3);
    }
}
