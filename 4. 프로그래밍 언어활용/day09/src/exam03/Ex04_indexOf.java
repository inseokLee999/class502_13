package exam03;

public class Ex04_indexOf {
    public static void main(String[] args) {
        String fruits="Apple, Orange, Cherry, Dragonfruit, Apple";
        System.out.printf("fruits.indexOf(Apple) : %d%n",fruits.indexOf("Apple"));
        System.out.printf("fruits.lastIndexOf(Apple) : %d%n",fruits.lastIndexOf("Apple"));
        System.out.printf("fruits.indexOf(Banana) : %d%n",fruits.indexOf("Banana"));//없으면 -1
    }
}
