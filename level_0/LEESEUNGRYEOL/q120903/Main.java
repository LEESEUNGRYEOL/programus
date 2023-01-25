package level_0.LEESEUNGRYEOL.q120903;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"a", "b"};
        int answer = sol.solution(s1, s2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])){cnt++;}
            }
        }
        return cnt;
    }
}