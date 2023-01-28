package level_0.LEESEUNGRYEOL.q120892;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String cipher = "dfjardstddetckdaccccdegk";
        int code =4;
        String answer = sol.solution(cipher,code);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int index = code-1;
        while(index < cipher.length() )
        {
            answer+=cipher.charAt(index);
            index+=code;
        }

        return answer;
    }
}