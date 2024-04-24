package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str1="가나다";
        String str2="가나다";
        System.out.println(str1==str2);
        System.out.printf("str1주소 :  %d , str2 주소: %d%n",System.identityHashCode(str1), System.identityHashCode(str2));
    }
}
