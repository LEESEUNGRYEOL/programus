package level_0.parkjaeyong.q120889;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return (sides[1] + sides[0]) > sides[2] ? 1 : 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int ans = sol.solution(new int[]{0, 31, 24, 10, 1, 9});
        System.out.println("ans = " + ans);

    }
}

