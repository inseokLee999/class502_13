package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(001,"난중일기","이순신"));
        books.add(new Book(002,"홍길동전","허균"));
        books.add(new Book(003,"훈민정음","세종대왕"));
        books.add(new Book(004,"조선왕조실록","조선"));
        books.add(new Book(005,"직지심체요절","경한"));

        Iterator<Book> iter = books.iterator();

        while(iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }
        Iterator<Book> iter2 = books.iterator();
        while(iter2.hasNext()){
            Book book = iter2.next();
            System.out.println(book.toString());
        }
    }
}
