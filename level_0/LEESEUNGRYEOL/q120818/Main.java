package level_0.LEESEUNGRYEOL.q120818;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer;
        int price1 = 100010;
        int price2 = 1000000;
        answer = sol.solution(price1);
        System.out.println(answer);
        answer = sol.solution(price2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int price) {
        if (price >= 100000 && 300000 > price) {
            return (int) Math.floor(price * 0.95);
        }
        if (price >= 300000 && 500000 > price) {
            return (int) Math.floor(price * 0.9);

        }
        if (price >= 500000) {
            return (int) Math.floor(price * 0.8);
        }
        else{
            return price;
        }
    }
}
