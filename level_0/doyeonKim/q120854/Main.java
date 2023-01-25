package level_0.doyeonKim.q120854;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(sol.solution(strlist)));
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for (String str : strlist) {
            answer[idx++] = str.length();
        }
        return answer;
    }
}
