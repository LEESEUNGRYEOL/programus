package level_0.doyeonKim.q120818;

class Solution {
    public int solution(int price) {
        if (price >= 100000 && price < 300000)
            return (int) (price * 0.95);
        else if (price >= 300000 && price < 500000)
            return (int) (price * 0.9);
        else if (price >= 500000)
            return (int) (price * 0.8);
        else
            return price;
    }
}

/*
    구매한 옷의 가격에 따라 경우를 나누어 계산한다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price1 = 150000;
        int price2 = 580000;
        System.out.println(sol.solution(price1));
        System.out.println(sol.solution(price2));
    }
}
