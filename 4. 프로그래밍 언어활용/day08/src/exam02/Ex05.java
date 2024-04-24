package exam02;

public class Ex05 {
    public static void main(String[] args) {
        String str0="ABC";
        String str1= new String("ABC");
        String str2 = new String("ABC");
        System.out.printf("str1==str2: %s%n",str1==str2);
        System.out.printf("str0==str2: %s%n",str0==str2);
        System.out.printf("str1.equals(str2): %s%n",str1.equals(str2));
        System.out.println("str0"+System.identityHashCode(str0));
        System.out.println("str1"+System.identityHashCode(str1));
        System.out.println("str2"+System.identityHashCode(str2));
    }
}
