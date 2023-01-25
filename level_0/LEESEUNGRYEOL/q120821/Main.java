package level_0.LEESEUNGRYEOL.q120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1,2,3,4,5};
        int[] answer = sol.solution(num_list);
        System.out.println(Arrays.toString(answer));
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0 ; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0 ){answer[0]++;}
            else{answer[1]++;}
        }
        return answer;
    }
}