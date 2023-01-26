package q120803;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 1;
        int num2 = 2;
        int ans = sol.solution(num1, num2);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}
