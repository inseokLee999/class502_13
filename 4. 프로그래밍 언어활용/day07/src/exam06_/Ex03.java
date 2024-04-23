package exam06_;

public class Ex03 {
    public static void main(String[] args) {
        Book book1 = new Book(1000,"돈키호테","김경식");
        Book book2 = new Book(1000,"돈키호테","김경식");
        System.out.printf("book1==book2 : %s",book1==book2);
        System.out.printf("book1.equals(book2):%s",book1.equals(book2));
    }
}
