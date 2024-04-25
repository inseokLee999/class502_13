package exam01_enum;

public class Ex03 {
    public static void main(String[] args) {
        Transportation BUS= Transportation.BUS;
        Enum<Transportation> trans = BUS;
        System.out.println(trans instanceof Enum);
//        System.out.println(BUS instanceof Transportation);
    }
}
