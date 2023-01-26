public class Main {
    public static void main(String[] args) {
    Solution sol = new Solution();
    int ans = sol.solution(4,3);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int num1, int num2) {
        if (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
            int answer = num1 * num2;
            return answer;
        }
    return solution(num1, num2);}
}
