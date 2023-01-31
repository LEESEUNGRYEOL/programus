package level_0.doyeonKim.q120891;

import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).filter(s -> s.matches("[369]")).count();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 29423;
        System.out.println(sol.solution(order));
    }
}
