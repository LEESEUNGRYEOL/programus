package level_0.parkjaeyong.q120824;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(ans));
    }
}

