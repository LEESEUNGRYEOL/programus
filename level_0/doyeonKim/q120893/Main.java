package level_0.doyeonKim.q120893;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");
        for (String s : str) {
            if (s.charAt(0) >= 'a')
                sb.append(s.toUpperCase());
            else
                sb.append(s.toLowerCase());
        }
        return sb.toString();
    }
}

/*
    대문자 -> 소문자 (toLowerCase)
    소문자 -> 대문자 (toUpperCase)
    toLowerCase, toUpperCase 사용하기 위해 글자 하나 하나를 String으로 만든다. (split 사용)
    대/소문자 구분 -> 소문자의 아스키 코드 값은 모두 `a` 보다 크고, 대문자는 모두 'a' 보다 작다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "abCdEfghIJ";
        System.out.println(sol.solution(my_string));
    }
}
