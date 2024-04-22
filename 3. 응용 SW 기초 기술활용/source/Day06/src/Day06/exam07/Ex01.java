package Day06.exam07;

public class Ex01 {
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner in=out.new Inner();
    }
}
