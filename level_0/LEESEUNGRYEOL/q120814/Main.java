package level_0.LEESEUNGRYEOL.q120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}

class Solution{
    public int solution(int n) {
        if (n%7 == 0)
        {
            return n/7;
        }
        else {
            return (n/7 + 1);
        }
    }
}
