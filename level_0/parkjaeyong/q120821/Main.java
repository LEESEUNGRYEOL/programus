package level_0.parkjaeyong.q120821;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0,j= num_list.length-1; i <= num_list.length / 2 ; i++,j--){
            answer[i] = num_list[j];
            answer[j] = num_list[i];
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int[] ans = sol.solution(new int[]{1, 0, 1, 1, 1, 3, 5});
        System.out.println(Arrays.toString(ans));

    }
}

