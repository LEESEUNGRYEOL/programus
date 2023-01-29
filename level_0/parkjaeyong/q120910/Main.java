package level_0.parkjaeyong.q120910;


class Solution {
    public int solution(int n, int t) {
        return n * (int)Math.pow(2,t);
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(7,15);
        System.out.println(ans);
    }
}

