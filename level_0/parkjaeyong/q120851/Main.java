package level_0.parkjaeyong.q120851;


class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]","");
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            answer += my_string.charAt(i) - '0';
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution("aAb1B2cC34oOp");
        System.out.println(ans);
    }
}

