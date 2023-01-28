package level_0.LEESEUNGRYEOL.q120837;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int hp = 999;
        int answer = sol.solution(hp);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int hp) {
        int cnt = 0;
        while(hp != 0)
        {
            if(hp>=5)
            {
                cnt += hp/5;
                hp = hp % 5;

            }
            else if(hp>=3)
            {
                cnt += hp/3;
                hp %= 3;
            }
            else if(hp>0)
            {
                cnt++;
                hp -= 1;

            }
        }
        return cnt;
    }
}