package level_0.LEESEUNGRYEOL.q120839;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "205"	;
        String answer = sol.solution(rsp);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] win = new char[rsp.length()];

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                win[i] = '0';
            }
            if (rsp.charAt(i) == '5') {
                win[i] = '2';
            }
            if (rsp.charAt(i) == '0') {
                win[i] = '5';
            }
        }
        answer = new String(win);
        return answer;
    }
}