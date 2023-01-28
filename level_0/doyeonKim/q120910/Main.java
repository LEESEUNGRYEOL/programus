package level_0.doyeonKim.q120910;

class Solution {
    public int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}

/*
    t시간 후 세균의 수 == 세균 수(n) * 2^t
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2;
        int t = 10;
        System.out.println(sol.solution(n, t));
    }
}
