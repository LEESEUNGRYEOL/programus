package src.lv0.q120837;

class Solution {
    public int solution(int hp) {
        int answer = 0;

        answer += hp/5;
        hp %=5;
        answer += hp/3;
        hp %=3;
        answer += hp;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int hp =23;
        Solution solution = new Solution();
        System.out.println(solution.solution(hp));
    }

}
