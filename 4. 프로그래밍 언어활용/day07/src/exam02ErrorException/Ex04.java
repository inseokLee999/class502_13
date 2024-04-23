package exam02_ErrorException;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis= new FileInputStream("a2.txt");
            System.out.println("Use File");
            fis.close();//IOException
            System.out.println("File Close Done");
        }catch(IOException e){
            e.printStackTrace();

        }finally{
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
