package src.lv0.q120910;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n, int t) {
        return IntStream.rangeClosed(1,t).reduce(n,(a,b)->a*2);
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        Solution solution = new Solution();
        System.out.println(solution.solution(n,t));
    }

}
