package level_0.LeeGeonHo.q120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n= 1;
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer=0;
        if(n%7>0){
            answer = (n/7)+1;
        } else if (n%7==0) {
            answer=n/7;
        }
        return answer;
    }
}