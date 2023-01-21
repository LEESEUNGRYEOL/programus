package level_0.doyeonKim.q120822;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "jaron";
        System.out.println(sol.solution(my_string));
    }
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        return sb.reverse().toString();
    }
}
