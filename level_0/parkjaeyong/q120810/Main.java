package level_0.parkjaeyong.q120810;

class Solution {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 10;
        int num2 = 5;
        int ans = sol.solution(num1, num2);
        System.out.println(ans);
    }
}

