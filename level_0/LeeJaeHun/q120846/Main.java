package src.lv0.q120846;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {

        return (int)IntStream.rangeClosed(1,n).filter(i->IntStream.rangeClosed(1,i).filter(q->i%q==0).count()>=3).count();
    }


    public int solution2(int n) {
        int answer =0;
        for (int i = 1; i <= n; i++) {
            int count =0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0) count++;
            }
            if(count>=3) answer++;
        }
        return answer;
    }

}

public class Main {
    public static void main(String[] args) {
        int n = 15;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
