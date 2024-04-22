package exam01;

public class Ex07_중첩반복문 {
    public static void main(String[] args) {
        for(int j=2;j<10;j++){
            for(int i=2;i<10;i++){
                System.out.printf("%d X %d = %d ",i,j,i*j);
            }
            System.out.printf("\n");
        }
        return ;
    }
}
