package exam01;

public class ProxyCalculator implements Calculator {
//    implCalc, RecCalc 대신에 해주려면? 자료형?

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime(); //공통 기능
        try {
//        다른 계산기의 핵심기능을 대신 수핵
            long result = calculator.factorial(num);
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d\n", etime - stime);
        }
    }
}
