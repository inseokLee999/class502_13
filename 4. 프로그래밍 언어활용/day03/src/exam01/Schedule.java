package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;
    public Schedule(){
        this(2024,4,17);
    }

    public Schedule(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void showDate(){
        System.out.printf("%d년 %d월 %d일\n",year,month,day);
    }

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
        if(month>12){
            System.out.print("Month는 12를 초과할 수 없습니다\n");
            System.out.printf("%d를 12로 설정합니다\n",month);
            month=12;
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(this.month==2 && day>28){
            System.out.print("2월은 28일을 초과할 수 없습니다\n");
            System.out.printf("%d를 28일로 설정합니다\n",day);
            day=28;
        }
        this.day = day;
    }
    public void printThis(){
        System.out.println(this);
    }
    public Schedule returnThis(){
        return this;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
