package level_0.parkjaeyong.q120809;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        for(int i = 0 ; i < numbers.length; i++)
            numbers[i] *= 2;
        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 10;
        int num2 = 5;
        int[] ans = sol.solution(new int[]{1, 2, 100, -99, 1, 2, 3});
        System.out.println(Arrays.toString(ans));
    }
}

