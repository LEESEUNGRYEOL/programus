package level_0.LIHASEO.q120805;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 10;
        int n2 = 5;
        int answer = sol.solution(n1, n2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }
}