package exam02;

import java.util.Objects;

public class Book {
    String title;
    String author;
    String publisher;

    public Book(){};
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ",hashcode()='"+hashCode()+'\''+
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author,publisher);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            Book book=(Book)obj;
            if(title.equals(book.title)&&author.equals(book.author)&&publisher.equals(book.publisher)){
                return true;
            }
        }
        return false;
    }
}
