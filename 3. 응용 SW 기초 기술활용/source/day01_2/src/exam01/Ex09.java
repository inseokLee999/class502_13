package exam01;

public class Ex09 {
    public static void main(String[] args) {
        long num1=1000000000000L;//8
        double num2=num1;//정수 -> 실수 : 자동 형변환(묵시적 형변환)-8
        float num3=num1;//실수는 4바이트더라도 모든 정수를 포함하기 때문에 가능
        System.out.println(num3);
        double num4=0.0;
        for(int i=0;i<10000;i++){
            num4+=0.1;
        }
        System.out.println(num4);
    }
}
