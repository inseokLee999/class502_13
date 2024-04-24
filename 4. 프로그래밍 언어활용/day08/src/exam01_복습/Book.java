package exam01_복습;

import java.util.Objects;

public class Book {
    private int isbn;
    private String title;
    private String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {//Object obj = b2
        if(obj instanceof Book){//obj가 Book 의 인스턴스 인지 체크
            Book book=(Book)obj;
            if(isbn == book.isbn && title.equals(book.title) && author.equals(book.author)) return true;
        }
        return false;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }*/


    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author);
    }
}
