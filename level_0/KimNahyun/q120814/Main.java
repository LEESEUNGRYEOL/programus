package level_0.KimNahyun.q120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 15;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=7; i<n; i+=7){
            answer++;
        }
        return answer;
    }
}