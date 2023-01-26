package level_0.LIHASEO.q120836;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(30);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                total++;
            }
        }
        int answer = total;
        return answer;
    }
}
