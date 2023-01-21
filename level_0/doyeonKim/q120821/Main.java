package level_0.doyeonKim.q120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = num_list.length - 1;
        for (int num : num_list) {
            answer[idx--] = num;
        }
        return answer;
    }
}
