package exam02_StringClass;

public class Ex05_MethodChaining {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        //메서드 체이닝
        sb.append("ABC").append("DEF").append("GHI");
        System.out.println(sb.toString());
        String str=sb.toString();
        System.out.println(sb);
        /*
        StringBuffer sb2= sb.append("ABC");
        StringBuffer sb3= sb2.append("DEF");
        */
    }
}
