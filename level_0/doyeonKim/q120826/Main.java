package level_0.doyeonKim.q120826;

class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");    // replaceAll 이용하여 letter 글자를 ""로 모두 바꾼다.
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "BCBdbe";
        String letter = "B";
        System.out.println(sol.solution(my_string, letter));
    }
}
