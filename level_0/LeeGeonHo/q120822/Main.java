package level_0.LeeGeonHo.q120822;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string= "jaron";
        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuffer sd = new StringBuffer(my_string);
        String answer = sd.reverse().toString();
        return answer;
    }
}