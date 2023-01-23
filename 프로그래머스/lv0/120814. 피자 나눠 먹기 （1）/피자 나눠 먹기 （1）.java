public class Main {
    public static void main(String[] args) {
    Solution sol = new Solution();
    int ans = sol.solution(62);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n >= 0 && n <= 100 && n%7 == 0) {
        answer = n/7;
        } else if (n < 7 || n%7 != 0) {
            answer = n/7 + 1;
        }
        return answer;
    }

}