package exam01;

public class 연습문제5 {
    public static int numbernum=11;
    public static void main(String[] args) {
        // 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요
        System.out.println("구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력");
        for(int i=1;i<10;i++){
            System.out.printf("===== %d단 =====\n",i);
            for(int j=i;j<10;j++){
                System.out.printf("%d * %d = %d\n",i ,j ,i*j);
            }
            //if(i>j){System.out.printf("%d * %d = %d\n",i ,j ,i*j)}
            //if(i<=j){System.out.printf("%d * %d = %d\n",i ,j ,i*j);
        }
    }
}