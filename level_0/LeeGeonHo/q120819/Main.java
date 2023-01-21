package level_0.LeeGeonHo.q120819;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money= 5500;

        System.out.println(Arrays.toString(sol.solution(money)));
    }
}

class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}