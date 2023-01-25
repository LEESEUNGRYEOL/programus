package level_0.parkjaeyong.q120847;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(new int[]{0, 31, 24, 10, 1, 9});
        System.out.println(ans);
//        System.out.println(Arrays.toString(ans));

    }
}

