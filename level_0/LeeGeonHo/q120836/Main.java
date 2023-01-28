package level_0.LeeGeonHo.q120836;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 20;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer++;
            }
        }
        return answer;
    }
}
