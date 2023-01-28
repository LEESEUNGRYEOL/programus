package level_0.LeeGeonHo.q120826;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(sol.solution(my_string,letter));
    }
}

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}
