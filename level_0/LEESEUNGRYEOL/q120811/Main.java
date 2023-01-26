package level_0.LEESEUNGRYEOL.q120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer;
        int n1 = 24;
        int n2 = 100;
        answer = sol.solution(n1);
        System.out.println(answer);
        answer = sol.solution(n2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n) {
        int cnt = 0, i = 1, j = 0, flag = 0;
        // 제곱수가 아닌경우
        while (true) {
            if (n % i == 0) {
                if (i == j) {
                    break;
                }
                j = n / i;
            cnt++;
            }
            if (i == j) {
                flag = 1;// 제곱수인 경우
                break;

            }
            i++;
        }
        return flag == 0 ? 2 *cnt: 2*cnt-1;
    }
}
