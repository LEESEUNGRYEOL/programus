package level_0.LEESEUNGRYEOL.q120845;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] box = {10,8,6};
        int n = 3;
        int answer = sol.solution(box, n);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int length:box)
        {
            answer *= length/n;
        }

        return answer;
    }
}