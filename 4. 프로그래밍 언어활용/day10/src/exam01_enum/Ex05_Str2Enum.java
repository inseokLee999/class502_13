package exam01_enum;

public class Ex05_Str2Enum {
    public static void main(String[] args) {
        String tran1="BUS";

//        Transportation BUS = Enum.valueOf(Transportation.class,tran1);
//        System.out.println(BUS.name());//BUS

        Transportation CAR = Transportation.valueOf(tran1);//문자열 형태를 사용하여 상수로 바꿔준다.
        System.out.println(CAR);//BUS
    }
}
