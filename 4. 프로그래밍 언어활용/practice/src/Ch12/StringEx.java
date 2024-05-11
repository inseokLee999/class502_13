package Ch12;

public class StringEx {
    public static void main(String[] args) {
        String str = new String("abcbe");
        String str2 = new String("ABCDE");
        String str3 = str.concat(str2);
        String str5 = String.valueOf(250);
        System.out.println(str5);
        char[] chars = {'a','b','c','D','E'};
        String str4 = String.copyValueOf(chars,0,3);
        System.out.println(str4);
        System.out.println(str);
        String str6 = new String("     ");
//        System.out.println(str6.isEmpty());
//        System.out.println(str6.isBlank());
        System.out.println(str.indexOf('b'));
        System.out.println(str.lastIndexOf('b'));
//        System.out.println(str.charAt(3));
//        System.out.println(str.codePointAt(0));
//        System.out.println(str.codePointBefore(1));
//        System.out.println(str.codePointCount(0,5));
//        System.out.println(str.compareTo(str2));
//        System.out.println(str.compareToIgnoreCase(str2));
//        System.out.println(str3);
//        System.out.println(str.contains("abC"));
//        System.out.println(str.contentEquals("abcde"));
//        System.out.println(str.endsWith("d"));
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));

    }
}
