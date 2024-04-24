package exam03_Wrapper;

public class Ex05 {
    public static void main(String[] args) {
        int num1=100;
        Integer num2=Integer.valueOf(200);

        int result=num1+num2.intValue();
        System.out.println(result);
        Integer num3=Integer.valueOf(100);
        Integer num4=Integer.valueOf(200);
        int result2=num3+num4;
        System.out.println(result2);
    }
}
