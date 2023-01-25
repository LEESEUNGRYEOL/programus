package level_0.LEESEUNGRYEOL.q120809;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[]{1,2,3,4,5};

        int[] answer = sol.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution{
    public int[] solution(int[] numbers) {
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = 2 *numbers[i];
        }
        return numbers;
    }
}
