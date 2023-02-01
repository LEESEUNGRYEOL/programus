package level_0.LEESEUNGRYEOL.q120886;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String before = "allpe";
        String after = "apple";
        int answer = sol.solution(before,after);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String before, String after) {
        char[] tmp1;
        char[] tmp2;
        int cnt = 0;
        tmp1 = before.toCharArray();
        tmp2 = after.toCharArray();
        Arrays.sort(tmp1);
        Arrays.sort(tmp2);
        System.out.println("tmp1 = " + Arrays.toString(tmp1));
        System.out.println("tmp2 = " + Arrays.toString(tmp2));
        for (int i = 0; i < tmp1.length; i++) {
            if(tmp1[i] == tmp2[i])
            {
                cnt++;
            }
        }
        if(cnt == tmp1.length)
        {
            return 1;
        }
        return 0;
    }
}