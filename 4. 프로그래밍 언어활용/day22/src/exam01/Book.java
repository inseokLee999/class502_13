package exam01;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionId = 1l;
    private int isbn;
    private String title;
    private String author;
    private int price;
    public int getPrice(){
        return price;
    }

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
}
