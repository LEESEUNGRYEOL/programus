package level_0.doyeonKim.q120908;

class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}

/*
    문자열이 문자열을 포함하는가 -> contains 사용
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(sol.solution(str1, str2));
    }
}
