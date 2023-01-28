package level_0.parkjaeyong.q120849;


class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[a|e|i|o|u]","");
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("nice to meet you");
        System.out.println(ans);
    }
}

