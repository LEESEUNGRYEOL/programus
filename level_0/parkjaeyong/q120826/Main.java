package level_0.parkjaeyong.q120826;


class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("BCBdbe", "B");
        System.out.println(ans);
    }
}

