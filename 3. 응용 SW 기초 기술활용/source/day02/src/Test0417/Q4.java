package Test0417;

public class Q4 {
    public static void main(String[] args) {
        //구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.
        for(int i=1;i<10;i++){
            System.out.printf("===== %d단 =====\n",i);
            for(int j=i;j<10;j++){
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }
        }
    }
}
