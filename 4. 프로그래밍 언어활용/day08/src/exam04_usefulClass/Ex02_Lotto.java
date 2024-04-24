package exam04_usefulClass;

import java.util.Arrays;

import static java.lang.Math.*;

public class Ex02_Lotto {
    public static void main(String[] args) {
        //1~45, 6개의 숫자 -  중복 x
        int cnt=0;

        int[] lotto=new int[6];
        while(cnt<6){
            int num=getNumber();
            if(chkDuplicate(lotto,num)){
                continue;
            }
            lotto[cnt] = getNumber();
            cnt++;
        }
        System.out.println(Arrays.toString(lotto));
    }
    public static int getNumber(){
        return (int) (random()*45)+1;
    }
    public static boolean chkDuplicate(int[] lotto,int num){
        for(int n : lotto){
            if(n==num)return true;
        }
        return false;
    }
}
