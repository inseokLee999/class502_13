package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("a.txt");
            //fis.close();//IOException
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //예외가 발생하든 안하든 무조건 실행되는 코드
            if(fis!=null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            System.out.println("자원 해제");
        }

    }
}
