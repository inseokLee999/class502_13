package exam03;

import static java.lang.Math.pow;

public class SimpleCalculator implements Calculator{
    public int add(int num1, int num2) {
        return (int)pow(num1,num2);
    }
}
