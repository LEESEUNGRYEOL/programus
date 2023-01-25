package level_0.doyeonKim.q120898;

class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = "happy birthday!";
        System.out.println(sol.solution(message));
    }
}

/*
    문자열의 길이를 구할 수 있으면 쉽게 풀 수 있는 문제였다.
 */
