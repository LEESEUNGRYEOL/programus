package level_0.hongyeseok.q120903;

import java.util.HashSet;

public class q120903 {
    public static void main(String[] args) {
        String[] s1 = new String[]{"n", "omg"};
        String[] s2 = {"m", "dot"};
        Solution solution = new Solution();
        System.out.println(solution.solution(s1,s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> wholeString = new HashSet<>();

        for (String s : s1) {
            wholeString.add(s);
        }

        for (String s : s2) {
            wholeString.add(s);
        }
        answer = s1.length + s2.length - wholeString.size();
        return answer;
    }
}