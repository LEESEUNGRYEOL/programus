package src.lv0.q120892;

import java.util.Arrays;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code-1; i < cipher.length(); i += code ) {
            answer += cipher.charAt(i);
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String cipher = "pfqallllabwaoclk";
        int code = 2;
        Solution solution = new Solution();
        System.out.println(solution.solution(cipher,code));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
