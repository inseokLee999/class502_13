package exam01복습;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Calculator cal= outer.method(100);
        int result=cal.add(10,30);
        System.out.println(result);
    }
}
