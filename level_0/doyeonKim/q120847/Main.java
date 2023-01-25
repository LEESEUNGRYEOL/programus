package level_0.doyeonKim.q120847;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int last_index = numbers.length - 1;
        return numbers[last_index] * numbers[last_index - 1];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(sol.solution(numbers));
    }
}
