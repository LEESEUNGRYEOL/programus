package level_0.doyeonKim.q120851;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9')
                answer += my_string.charAt(i) - '0';
        }

        return answer;
    }
}

/*
    문자 하나씩 비교하면서 숫자인 경우, 더한다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(sol.solution(my_string));
    }
}
