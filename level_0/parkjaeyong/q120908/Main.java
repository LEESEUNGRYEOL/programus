package level_0.parkjaeyong.q120908;


class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2 ;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution("ab6CDE443fgh22iJKlmn1o","6CD");
        System.out.println(ans);
    }
}

