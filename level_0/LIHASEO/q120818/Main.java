package level_0.LIHASEO.q120818;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(700000);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int price) {
        if (price >= 100000 && price < 300000) {
            price = (int)(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            price = (int)(price * 0.9);
        } else if (price >= 500000) {
            price = (int)(price * 0.8);
        }
        int answer = price;
        return answer;
    }
}