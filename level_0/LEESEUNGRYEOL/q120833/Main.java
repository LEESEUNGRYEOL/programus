package level_0.LEESEUNGRYEOL.q120833;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[]{1,2,3,4,5};
        int num1 = 1, num2= 3;
        int[] answer = sol.solution(numbers,num1,num2);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1];
            num1++;
        }
        return answer;
    }
}
