package level_0.LeeGeonHo.q120809;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers ={1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]*=2;
        }
        return answer=numbers;
    }
}