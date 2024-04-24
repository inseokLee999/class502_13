package exam02_StringClass;

public class Ex04_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        System.out.printf("sb 주소 : %d%n", System.identityHashCode(sb));
        sb.append("ABC");
        System.out.printf("sb 주소 : %d%n", System.identityHashCode(sb));
        sb.append("DEF");
        System.out.printf("sb 주소 : %d%n", System.identityHashCode(sb));
        String str= sb.toString();
        System.out.printf("str 주소 : %d%n", System.identityHashCode(str));
        System.out.println(str);
    }
}
