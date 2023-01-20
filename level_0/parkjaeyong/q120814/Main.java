package level_0.parkjaeyong.q120814;

class Solution {
    public int solution(int n) {
        return n / 7 + (n % 7 != 0 ? 1 : 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

