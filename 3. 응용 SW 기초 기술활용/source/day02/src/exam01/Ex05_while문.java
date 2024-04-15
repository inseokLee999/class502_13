package exam01;

public class Ex05_while문 {
    public static void main(String[] args) {
        //int total=0;
        //int num=0;
        int total=0,num=0;//초기 값

        while(num<=100){//반복을 멈추는 조건 식
            total+=num;//증감식
            num++;
        }
        System.out.println("합계 : "+ total);
        System.out.printf("합계 : %d",total);
    }
}
