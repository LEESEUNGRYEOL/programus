package level_0.LEESEUNGRYEOL.q120846;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n =15;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%j == 0)
                {
                    cnt++;
                }
            }
            if(cnt >= 3)
            {
                answer++;
            }
            cnt =0;
        }
        return answer;
    }
}