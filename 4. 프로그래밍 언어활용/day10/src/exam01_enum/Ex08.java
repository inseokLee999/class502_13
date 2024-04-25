package exam01_enum;

public class Ex08 {
    public static void main(String[] args) {
        Transportation BUS = Transportation.BUS;
        System.out.println(BUS.getFare());//1500
        System.out.println(Transportation.METRO.getFare());
    }
}
