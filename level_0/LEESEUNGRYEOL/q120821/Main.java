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

// 나의 풀이
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
//      int[] answer;
        int cnt = 0;
        for (int i = num_list.length -1 ; i >=0 ; i--) {
            answer[cnt] = num_list[i];
            cnt++;
        }
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println("answer= " + answer[i]);
//        }
        return answer;
    }
}