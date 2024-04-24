package exam02_StringClass;

public class Ex03_final {
    public static void main(String[] args) {
        String str="ABC";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));
        str+="DEF";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));
        str+="GHI";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));
    }
}
