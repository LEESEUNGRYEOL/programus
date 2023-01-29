package level_0.parkjaeyong.q120892;


class Solution {
    public String solution(String cipher, int code) {
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while((++n * code-1) < cipher.length())
            sb.append(cipher.charAt(n*code-1));
        return sb.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("dfjardstddetckdaccccdegk",4);
        System.out.println(ans);
    }
}

