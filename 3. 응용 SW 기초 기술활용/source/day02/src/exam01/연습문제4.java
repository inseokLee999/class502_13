package exam01;

public class 연습문제4 {
    public static void main(String[] args) {
        //구구단을 홀수 단만 출력하도록 프로그램을 만드시오.
        for(int i=1;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.printf("===== %d단 =====\n",i);
            for(int j=1;j<10;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
