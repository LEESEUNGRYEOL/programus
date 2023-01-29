package level_0.KimNahyun.q120805;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 10;
        int num2 = 5;
        int ans = sol.solution(num1,num2);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
}