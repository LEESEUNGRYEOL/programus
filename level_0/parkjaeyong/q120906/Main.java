package level_0.parkjaeyong.q120906;


class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += (n%10);
            n/=10;
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(930211);
        System.out.println(ans);
    }
}

