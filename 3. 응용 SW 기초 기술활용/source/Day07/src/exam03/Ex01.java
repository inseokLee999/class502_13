package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01 {
    public static void main(String[] args) {
        //FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            System.out.println("All clear");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("important code");
    }
}
