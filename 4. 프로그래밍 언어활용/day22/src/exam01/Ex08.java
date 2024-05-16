package exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex08 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("book.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            Book book1 = new Book(1000,"서시","윤동주");
            Book book2 = new Book(1001,"난중일기","이순신");
            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject("hello");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
