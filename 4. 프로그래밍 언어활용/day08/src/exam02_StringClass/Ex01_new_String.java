package exam02_StringClass;

public class Ex01_new_String {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        System.out.printf("s1 == s2 : %s%n",s1==s2);
        System.out.printf("s1의 주소 : %d%n",System.identityHashCode(s1));
        System.out.printf("s2의 주소 : %d%n",System.identityHashCode(s2));
    }
}
