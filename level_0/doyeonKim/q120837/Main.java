package level_0.doyeonKim.q120837;

class Solution {
    public int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp;

        return answer;
    }
}

/*
    장군 5
    병정 3
    일개미 1
    공격력이 큰 순서대로 고른다.
    (체력 / 장군 공격력) -> (나머지 체력 / 병정 공격력) -> (나머지 체력 / 일개미)
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int hp = 23;
        System.out.println(sol.solution(hp));
    }
}
