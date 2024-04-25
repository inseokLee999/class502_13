package exam01_usefulClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03_ScanFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));

        int total=0;
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            total+=num;
        }
        System.out.println(total);
        /*
        while(sc.hasNext()){
            String lyrics = sc.next();
            System.out.println(lyrics);
        }
        */

    }
}
