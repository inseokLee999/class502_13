package exam02_ErrorException;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
//            AutoCloseable auto=fis;
//            auto.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
