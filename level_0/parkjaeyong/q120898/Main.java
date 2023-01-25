package level_0.parkjaeyong.q120898;

class Solution {
    public int solution(String message) {
        return message.length()*2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution("happy birthday!");
        System.out.println(ans);

    }
}

