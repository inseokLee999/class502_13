package exam01_usefulClass;

import java.util.Random;

public class Ex01_randomNext {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=0;i<6;i++){
            int num = rand.nextInt(); // 범위 설정 nextInt(origin, bound);
            System.out.println(num);
            boolean bool= rand.nextBoolean();
            System.out.println(bool);
        }
    }
}
