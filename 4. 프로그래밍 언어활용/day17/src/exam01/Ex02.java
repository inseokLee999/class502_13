package exam01;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MONTH,30);
        cal.roll(Calendar.MONTH,30);
        printDate(cal);

    }
    public static void printDate(Calendar cal){
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);//0-11
        int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);

        System.out.printf("year = %d, month = %d, day = %d, dayOfWeek = %d, weekOfYear = %d\n",year,month+1,day, dayofweek,weekOfYear);
    }
}
