package exam01복습;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A(){
            public void method() {
                System.out.println("Redefined Method!");
            }
        };
        a.method();

    }
}
