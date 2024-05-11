package Ch11;

public class Ex02 {
    public static void main(String[] args) {
        Integer iValue = Integer.valueOf(100);
        Integer iValue2 = Integer.valueOf("100");
        int myValue = iValue.intValue();
        System.out.println(myValue);
        System.out.println(iValue2+3);
    }
}
