package exam02;

import java.util.HashSet;

public class Ex07 {
    public static void main(String[] args) {
        HashSet<Book> books=new HashSet<>();
        books.add(new Book("책1","저자1","출판사1"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책1","저자1","출판사1"));
        books.add(new Book("책2","저자2","출판사2"));
        books.add(new Book("책1","저자3","출판사3"));
        for(Book book:books) {
            System.out.println(book);
        }
    }
}
