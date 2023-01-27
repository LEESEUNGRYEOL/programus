package level_0.JoMinSung.q120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n % 7 == 0) { //
            answer = n / 7;
        }else {
            answer = n / 7 + 1;
        }
        return answer;
    }
}