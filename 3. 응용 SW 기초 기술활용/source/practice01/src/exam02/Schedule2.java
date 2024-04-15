package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }



    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return "Schedule2{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public void printThis(){
        System.out.println(this);
        System.out.println(System.identityHashCode(this));
    }
    public Schedule2(){
        this(0,0,0);
    }
    public Schedule2(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
}
