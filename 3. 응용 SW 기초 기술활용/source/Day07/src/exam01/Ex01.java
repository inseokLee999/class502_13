package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer out=new Outer();
        Calculator cal=out.method(30);
        int result=cal.add(10,30);
        System.out.println(result);
    }
}
