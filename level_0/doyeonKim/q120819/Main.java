package level_0.doyeonKim.q120819;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 15000;
        System.out.println(Arrays.toString(sol.solution(money)));
    }
}

class Solution {
    public int[] solution(int money) {
        int americano = 5500;
        return new int[] {money / americano, money % americano};
    }
}
