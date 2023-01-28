package level_0.LEESEUNGRYEOL.q120851;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n= 7;
        int t =15;

        int answer = sol.solution(n,t);
        System.out.println(answer);
    }
}class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i <t ; i++) {
            answer *= 2;
        }
        return answer;
    }
}

