package level_0.doyeonKim.q120892;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0)
                sb.append(cipher.charAt(i));
        }
        return sb.toString();
    }
}

/*
    cipher 문자열에서 (code의 배수)번째 문자만 뽑는다.
    code의 배수 -> code로 나눴을 때 나머지가 없다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(sol.solution(cipher, code));
    }
}
