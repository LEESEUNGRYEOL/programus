package level_0.doyeonKim.q120825;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
        String my_string = "hello";
        int n = 3;
        System.out.println(sol.solution(my_string, n));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}

class Solution1 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char ch : my_string.toCharArray()) {
            answer += (ch + "").repeat(n);
        }
        return answer;
    }
}

