package level_0.parkjaeyong.q120813;

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int num = n % 2 == 0 ? n/2 : n / 2 + 1;
        int[] answer = new int[num];
        for(int i = 1,j = 0 ; i <= n ; i += 2)
            answer[j++] = i;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.solution(10);
        System.out.println(Arrays.toString(ans));
    }
}

