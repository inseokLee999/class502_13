package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //%d정수 %s문자열 %f실수 %o8진수 %c문자
        /**
         * % 자리수 s -> %5s "___ab"
         * % -자리수 s -> %-5s "ab___"
         */
        System.out.print("----");
        System.out.printf("%10s","ab");
        System.out.println("----");
        System.out.print("----");
        System.out.printf("%-10s","abc");
        System.out.println("----");
        System.out.print("----");
        System.out.printf("%010d",100);
        System.out.println("----");
    }
}
