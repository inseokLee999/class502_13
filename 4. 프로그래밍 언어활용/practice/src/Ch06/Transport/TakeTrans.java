package Ch06.Transport;

public class TakeTrans {
    public static void main(String[] args) {
        Student student1 = new Student("이인석",5000);
        Student student2 = new Student("김한나",10000);

        Bus bus100 = new Bus(100);
        student1.takeBus(bus100);
        student1.showInfo();
        System.out.println(bus100.toString());
    }
}
