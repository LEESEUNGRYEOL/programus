package level_0.hongyeseok.q120825;

import java.util.ArrayList;
import java.util.List;

public class q120825 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string,n));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] splittedString = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += splittedString[i];
            }
        }
        return answer;

    }
}

