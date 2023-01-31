package level_0.doyeonKim.q120897;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}

/*
    (n % i == 0)을 만족하는 i로만 배열에 담는다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 24;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}
