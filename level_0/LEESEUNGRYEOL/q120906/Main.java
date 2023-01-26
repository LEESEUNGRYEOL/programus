package level_0.LEESEUNGRYEOL.q120906;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer;
        int n1 = 1234;
        int n2 = 930211;
        answer = sol.solution(n1);
        System.out.println(answer);
        answer = sol.solution(n2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n) {
        int sum = 0;
        while (n / 10 != 0) {
            sum += n % 10;
            n = n / 10;
        }
        sum += n;
        return sum;
    }
}
