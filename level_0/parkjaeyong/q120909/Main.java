package level_0.parkjaeyong.q120909;


class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (int)sqrt ? 1 : 2;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(976);
        System.out.println(ans);
    }
}

