package exam01;

import org.junit.jupiter.api.Test;

public class test {
    @Test
    public class Solution {
        public int[] solution(int n) {
            int[] answer = {};
            for(int i = 1; i<=n; i++){
                if(n%i==0){
                    answer.add(i);
                }
            }
            return answer;
        }
    }
}
