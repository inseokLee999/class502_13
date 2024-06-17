package day02.bookshelf;

public interface Queue {
    void enqueue(String title);
    String dequeue();
    int getSize();
}
