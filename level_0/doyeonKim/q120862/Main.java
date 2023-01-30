package level_0.doyeonKim.q120862;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}

/*
    1. 정렬
    2. numbers[0] * numbers[1] 과 numbers[마지막인덱스-1] * numbers[마지막인덱스] -> 더 큰 것 찾기
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        System.out.println(sol.solution(numbers));
    }
}
