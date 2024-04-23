package exam06_;

public class Book {
    private int isbn;//도서 번호
    private String title;//책 제목
    private String author;//저자

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(){

    }
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
}
