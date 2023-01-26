package level_0.parkjaeyong.q120583;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = (int)Arrays.stream(array).filter(i -> i == n).count();
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(new int[]{1, 1, 2, 3, 4, 5},1);
        System.out.println(ans);
    }
}

