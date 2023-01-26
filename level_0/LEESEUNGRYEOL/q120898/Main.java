package level_0.LEESEUNGRYEOL.q120898;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = new String("happy birthday!");
        int answer = sol.solution(message);
        System.out.println(answer);
    }
}

class Solution{
    public int solution(String message) {
        return 2* message.length();
    }
}
