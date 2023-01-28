package level_0.doyeonKim.q120849;

class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

/*
    a, e, i, o, u 가 포함되어 있으면 -> "" 빈 문자로 바꾸기
    -> replaceAll 사용
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "nice to meet you";
        System.out.println(sol.solution(my_string));
    }
}
