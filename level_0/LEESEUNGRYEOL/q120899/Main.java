package level_0.LEESEUNGRYEOL.q120899;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {4, 455, 6, 8};

        int[] answer = sol.solution(numbers);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = -1;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
            {
                max = array[i];
                max_index  = i;
            }
        }
        answer[0] = max;
        answer[1] = max_index;
        return answer;
    }
}