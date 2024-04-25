package exam03;

public class Ex05 {
    public static void main(String[] args) {
        String str = "I like java and javascript";
        boolean matched = str.matches(".*java.*");
        System.out.println(matched);

        String str2 = "     ABC     ";
        String str3=str2.trim();
        System.out.println(str3);
        System.out.println(str2.stripLeading());//왼쪽여백제거
        System.out.println(str2.stripTrailing());//오른쪽 여백 제거
    }
}
