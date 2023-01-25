package level_0.doyeonKim.q120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        return (n % 7 == 0) ? (n / 7) : (n / 7 + 1);
    }
}
