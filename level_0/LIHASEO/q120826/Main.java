package level_0.LIHASEO.q120826;


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("fdhusofshufoahuo", "f");
        System.out.println(ans);

    }
}
class Solution {
    public String solution(String my_string, String letter) {
        my_string = my_string.replace(letter, "");
        String answer = my_string.replaceAll("\\s","");
        return answer;
    }
}