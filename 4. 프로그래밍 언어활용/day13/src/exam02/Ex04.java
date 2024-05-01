package exam02;

public class Ex04 {
    public static void main(String[] args) {
        Calculator cal= new Calculator() {
            public int add(int num1, int num2) {
                return num1+num2;
            }
            public int minus(int num1, int num2) {
                return 0;
            }
        };
    }
}
