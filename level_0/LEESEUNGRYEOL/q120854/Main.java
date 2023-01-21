package level_0.LEESEUNGRYEOL.q120854;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strlist = new String[]{"We", "are", "the", "world!"};
        int[] answer = sol.solution(strlist);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
