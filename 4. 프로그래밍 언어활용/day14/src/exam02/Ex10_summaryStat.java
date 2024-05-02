package exam02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Ex10_summaryStat {
    public static void main(String[] args) {
        int[] scores = {60,78,90,100,87};
        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        double avg= stat.getAverage();
        long count = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();
        long sum = stat.getSum();
        System.out.printf("average = %f, count = %d, max = %d, min = %d, sum = %d\n",avg,count,max,min,sum);
        System.out.println(stat.toString());
    }
}
