package level_0.LEESEUNGRYEOL.q120819;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 15000;
        int[] answer = sol.solution(money);
        System.out.println(Arrays.toString(answer));
    }
}

// 나의 풀이
class Solution {
    public int[] solution(int money) {
        int cnt = 0;
        while (money / 5500 != 0)
        {
            money = money - 5500;
            cnt++;
        }
        int[] answer = {cnt,money};
        return answer;
    }
}
