package level_0.LEESEUNGRYEOL.q120841;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {2,4};
        int answer = sol.solution(num_list);
        System.out.println(answer);
    }
}
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] < 0) {
            if (dot[1] < 0) {
                return 3;
            }
            if (dot[1] > 0) {
                return 2;
            }
        } else {
            if (dot[1] < 0) {
                return 4;
            }

            if (dot[1] > 0) {
                return 1;
            }
        }
        return answer;
    }
}