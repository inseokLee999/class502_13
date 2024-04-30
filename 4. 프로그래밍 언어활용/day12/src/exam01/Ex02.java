package exam01;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(001,"난중일기","이순신"));
        books.add(new Book(002,"홍길동전","허균"));
        books.add(new Book(003,"훈민정음","세종대왕"));
        books.add(new Book(004,"조선왕조실록","조선"));
        books.add(new Book(005,"직지심체요절","경한"));

        ListIterator<Book> iter = books.listIterator();
        System.out.println("------순방향------");
        while(iter.hasNext()){
            Book book = iter.next();
            int index = iter.nextIndex();
            System.out.println(book);
            System.out.println("index : "+index);
        }
        System.out.println("------역방향------");
        while(iter.hasPrevious()){
            Book book = iter.previous();
            int index = iter.previousIndex();
            System.out.println(book);
            System.out.println("index : "+index);
        }
    }
}
