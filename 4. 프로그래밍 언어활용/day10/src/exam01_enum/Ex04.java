package exam01_enum;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans= Transportation.METRO;
        String str = trans.name();//상수 -> 문자열
        System.out.println(str);//METRO
        String str2 = trans.toString();//상수 -> 문자열
        System.out.println(str2);//METRO
        int ordinal = trans.ordinal();//상수의 위치 번호
        System.out.println(ordinal);//1
    }
}
