package exam05;
import static java.lang.Math.round;

public class ComplexCalculator extends Calculator{
    @Override
    public int add(int num1, int num2) {
        return (int)(num1*num2*Math.PI);
    }
}
