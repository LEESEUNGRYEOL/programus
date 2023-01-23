package level_0.doyeonKim.q120841;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dot = {2, 4};
        System.out.println(sol.solution(dot));
    }
}

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] >= 0)
            answer = dot[1] >= 0 ? 1 : 4;
        else
            answer = dot[1] >= 0 ? 2 : 3;
        return answer;
    }
}
