package level_0.parkjaeyong.q120819;

import java.util.Arrays;

class Solution {
    public int[] solution(int money) {
        return new int[] {money / 5500,money % 5500};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int[] ans = sol.solution(5500);
        System.out.println(Arrays.toString(ans));

    }
}

