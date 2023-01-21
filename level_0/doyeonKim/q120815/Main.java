package level_0.doyeonKim.q120815;

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
        return n / getLcm(n, 6);
    }

    int getLcm(int a, int b) {
        if (a % b == 0)
            return b;
        return getLcm(b, a % b);
    }
}
