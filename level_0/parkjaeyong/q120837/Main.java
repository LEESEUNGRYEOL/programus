package level_0.parkjaeyong.q120837;


class Solution {
    public int solution(int hp) {
        int power = 5;
        int answer = 0;
        while(power >= 1){
            answer += (hp / power);
            hp %= power;
            power -= 2;
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(999);
        System.out.println(ans);
    }
}

