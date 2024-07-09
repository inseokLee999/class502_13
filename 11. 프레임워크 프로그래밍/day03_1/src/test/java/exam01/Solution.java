package exam01;

import org.junit.jupiter.api.Test;

public class Solution {
    @Test
    public void solution() {
        int n = 24;
        int[] answer = new int[0];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[answer.length()-1] = i;
            }
        }
        System.out.println(answer);
    }
}