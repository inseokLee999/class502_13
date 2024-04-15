package exam01;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[][] nums={ {-1, 0,1}, {1, 2, 3} };
        System.out.println(nums.length);// 2행
        System.out.println(nums[0].length);// 3열
        for(int i=0;i<nums.length;i++){
            //System.out.println(Arrays.toString(nums[i]));
            for(int j=0;j<nums[i].length;j++){
                System.out.printf("%d행, %d열 = %d%n",i,j,nums[i][j]);
            }
        }
    }
}
