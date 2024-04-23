package exam01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis = new FileInputStream("a.txt");
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(IOException e2){
                e2.printStackTrace();
            }
            System.out.println("자원 해제");
        }
    }
}
