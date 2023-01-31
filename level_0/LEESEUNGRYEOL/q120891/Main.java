package level_0.LEESEUNGRYEOL.q120891;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 29323;
        int answer = sol.solution(order);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        String[] tmp2;
        tmp2 = tmp.split("");
        for(String i: tmp2)
        {
            if(i.equals(String.valueOf(3))||i.equals(String.valueOf(6))||i.equals(String.valueOf(9)))
            {
                answer++;
            }
        }
        return answer;
    }
}