package level_0.doyeonKim.q120833;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int answer[] = new int[num2 - num1 + 1];
        int idx = 0;
        for (int i = num1; i <= num2; i++) {
            answer[idx++] = numbers[i];
        }
        return answer;
    }
}

class Solution1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(sol.solution(numbers, num1, num2)));
    }
}
