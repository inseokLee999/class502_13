package exam03;

public class Ex01_joinFormat {
    public static void main(String[] args) {
        String fruit = String.join("+","Apple", "Banana", "Cherry", "Drive", "Elephants", "Frog");
        System.out.println(fruit);

        String str = String.format("%d + %d = %d",10,20,30);
        System.out.println(str);

    }
}
