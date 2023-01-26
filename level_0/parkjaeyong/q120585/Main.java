package level_0.parkjaeyong.q120585;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int answer = 0;
        for(int i = array.length -1 ;i >= 0 ; i--, answer++)
            if(array[i] <= height) break;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(new int[]{180, 120, 140},190);
        System.out.println(ans);
    }
}

