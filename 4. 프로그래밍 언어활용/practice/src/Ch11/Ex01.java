package Ch11;

public class Ex01 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr);
        System.out.println("c처음 주소 값 : "+System.identityHashCode(javaStr));
        System.out.println(javaStr.endsWith("a"));
        javaStr = javaStr.concat(androidStr);
        System.out.println(javaStr);
        System.out.println("나중 주소 값 : "+System.identityHashCode(javaStr));
    }
}
