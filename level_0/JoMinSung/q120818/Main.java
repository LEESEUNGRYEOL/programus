package level_0.JoMinSung.q120818;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 150000;
        int ans = sol.solution(price);
        System.out.println(ans);
    }
}
class Solution {
    public int solution(int price) {
        float answer = 0;
        if (price >= 500000) {
            answer = price * 0.80f;
        } else if (price >= 300000) {
          answer = price * 0.90f;
        } else if (price >= 100000) {
          answer = price * 0.95f;
        } else {
            answer = price;
        }
        return (int) answer;    // 메서드가 int기 때문에 리턴값도 정수여야 되기 때문에 float(실수형)에서 int(정수)로 바꿔줌
    }
}
