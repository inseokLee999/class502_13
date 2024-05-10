package exam02;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("년 월 입력 : (종료 : exit 입력)");
            String input = sc.nextLine();
            if(input.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
            try{
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);
                System.out.printf("---- %d년 %d월 ----%n",year,month);
                System.out.println(" S   M   T   W   T   F   S");
//                getCalendar(year,month);
                int[] days = getCalendar(year,month);
                for(int i=0;i<days.length;i++){
                    int day = days[i];
                    if(day > 0){
                        System.out.printf("%2d  ",day);
                    }else{
                        System.out.print("    ");
                    }
                    if((i+1)%7==0){
                        System.out.println();
                    }
                }
                System.out.println();
            }catch(Exception e){//숫자형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘못되었습니다. 입력 예) 2024 5");
            }
        }
    }
//    public static Object getCalendar(int year, int month){
    public static int[] getCalendar(int year, int month){
        /**
         * 1. 매월의 1일이 어떤 요일에 시작하는지
         * 2. 매월의 종료일이 무엇인지 ( 30,31,28,29)
         */
        LocalDate startDate = LocalDate.of(year,month,1);
//        System.out.println("startDate = " + startDate);

        int startDay = startDate.getDayOfWeek().getValue()%7;
//        System.out.println("startDay = " + startDay );

        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
//        System.out.println("endDate = " + endDate);

        Period period = Period.between(startDate,endDate);
        int start = startDay*-1 +1;
        int[] days = IntStream.rangeClosed(start,endDate.getDayOfMonth()).toArray();
        return days;
//        System.out.println("period.getDays() : " + period.getDays());
/*        System.out.print(" ");
        System.out.print("    ".repeat(startDay));
        if(startDay>=3){
            System.out.print("\b");
        }
        for(int i = 1;i<=period.getDays()+1;i++){
            System.out.printf("%2d  ",i);
            startDay++;
            if(startDay%7==0){
                startDay=0;
                System.out.println();
            }

        }
        System.out.println();
        return null;
        */

    }

}
