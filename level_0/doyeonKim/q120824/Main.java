package level_0.doyeonKim.q120824;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int evenCnt = 0;
        int oddCnt = 0;
        for (int num : num_list) {
            if (num % 2 == 0)
                evenCnt++;
            else
                oddCnt++;
        }

        return new int[]{evenCnt, oddCnt};
    }
}

class Solution1 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int num : num_list)
            answer[num % 2]++;

        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] num_list) {
        return IntStream
                .of((int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(),(int) Arrays.stream(num_list).filter(i -> i % 2 != 0).count())
                .toArray();
    }
}
