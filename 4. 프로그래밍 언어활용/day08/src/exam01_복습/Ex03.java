package exam01_복습;

public class Ex03 {
    public static void main(String[] args) {
        Book b1= new Book(1000,"책1","저자1");
        Book b2= new Book(1000,"책1","저자1");
        Book b3=b1;
        System.out.printf("b1 == b2 : %s%n",b1 == b2);
        System.out.printf("b1.equals(b2) : %s%n",b1.equals(b2)); // Object - equals === 동일성 비교
        System.out.printf("b1.equals(b3) : %s%n",b1.equals(b3));
        System.out.printf("b1의 주소 : %d%n",System.identityHashCode(b1));
        System.out.printf("b2의 주소 : %d%n",System.identityHashCode(b2));
    }
}
