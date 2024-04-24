package exam01_복습;

public class Ex08 {
    public static void main(String[] args) {
        int result1=sum(10,20,30,40);
        int result2=sum(10,20,3);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int sum(int... nums){
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        return sum;
    }
}
