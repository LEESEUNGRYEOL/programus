package level_0.LIHASEO.q120814;

public class Main {
    public static void main(String[] args) {
    Solution pizza = new Solution();
    int ans = pizza.solution(62);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n >= 0 && n <= 100 && n%7 == 0) {
        answer = n/7;
        } else if (n < 7 || n%7 != 0) {
            answer = n/7 + 1;
        }
        return answer;
    }

}