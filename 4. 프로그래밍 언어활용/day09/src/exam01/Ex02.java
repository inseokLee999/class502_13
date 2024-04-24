package exam01;

import java.util.Objects;

public class Ex02 {
    public static void main(String[] args) {
        int hash1= Objects.hash("책1","저자1","제목1");
        int hash2= Objects.hash("책2","저자1","제목1");
        System.out.println(hash1);
        System.out.println(hash2);

    }
}
