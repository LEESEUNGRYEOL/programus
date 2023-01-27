package level_0.LeeGeonHo.q120910;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n*(int)Math.pow(2,t);
        return answer;
    }
}