package level_0.parkjaeyong.q120815;

class Solution {
    public int solution(int n) {
        int i = 0;
        while((++i * 6) % n != 0);
        return i;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

