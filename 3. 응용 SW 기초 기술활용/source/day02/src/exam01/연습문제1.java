package exam01;

public class 연습문제1 {
    public static void main(String[] args) {
        //변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int a=20;
        float b=3.0f;
        System.out.printf("a : %d, b : %.2f \n",a,b);
        System.out.printf("a + b = %d\n",(int)(a+b));
        System.out.printf("a - b = %d\n",(int)(a-b));
        System.out.printf("a * b = %d\n",(int)(a*b));
        System.out.printf("a / b = %d\n",(int)(a/b));
    }
}
