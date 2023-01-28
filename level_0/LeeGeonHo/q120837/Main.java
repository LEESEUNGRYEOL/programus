package level_0.LeeGeonHo.q120837;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int hp = 23;

        System.out.println(sol.solution(hp));
    }
}

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count = 0;

        count+=hp/5;
        hp %=5;

        count+=hp/3;
        hp %=3;

        count+=hp/1;

        return answer=count;
    }
}