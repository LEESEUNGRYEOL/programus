package level_0.LeeGeonHo.q120909;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        Double D = Math.sqrt(n);
        if(D-D.intValue()!=0){
            answer = 2;
        }else answer=1;

        return answer;
    }
}

