package level_0.parkjaeyong.q120822;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("bread");
        System.out.println(ans);
    }
}

