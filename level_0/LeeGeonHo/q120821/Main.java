package level_0.LeeGeonHo.q120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sol.solution(num_list)));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i =0; i< num_list.length; i++ ){
            answer[num_list.length -i -1] = num_list[i];

        }
        return answer;
    }
}