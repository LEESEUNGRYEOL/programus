package level_0.LEESEUNGRYEOL.q120862;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, -1, -2, -3};
        int answer = sol.solution(numbers);
        System.out.println("answers = " + answer);
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a, b;

        Arrays.sort(numbers);
        a = numbers[0] * numbers[1];
        b = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        answer = Math.max(a,b);
        return answer;
    }
}