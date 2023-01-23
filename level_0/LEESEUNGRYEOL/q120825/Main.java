package level_0.LEESEUNGRYEOL.q120825;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = new String();
        my_string = "hello";
        int n = 3;

        String answer = sol.solution(my_string,n);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = new String("");
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer = answer + my_string.charAt(i);
            }
        }
        return answer;
    }
}