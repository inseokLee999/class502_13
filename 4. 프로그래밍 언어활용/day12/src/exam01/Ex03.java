package exam01;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(001,"난중일기","이순신"));
        books.add(new Book(002,"홍길동전","허균"));
        books.add(new Book(003,"훈민정음","세종대왕"));
        books.add(new Book(004,"조선왕조실록","조선"));
        books.add(new Book(005,"직지심체요절","경한"));

        for(Book book:books){
            System.out.println(book);
        }
        books.forEach(System.out::println);
    }
}
