package src.lv0.q120899;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[tmp] < array[i]){
                tmp = i;
            }
        }
        int[] answer = {array[tmp],tmp};
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] n = {1, 8, 3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
