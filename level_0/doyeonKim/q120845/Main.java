package level_0.doyeonKim.q120845;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int len : box) {
            answer *= len / n;
        }
        return answer;
    }
}

/*
    상자에 들어가는 주사위의 개수
    = (가로 / 주사위 길이) * (세로 / 주사위 길이) * (높이 / 주사위 길이)
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(sol.solution(box, n));
    }
}
