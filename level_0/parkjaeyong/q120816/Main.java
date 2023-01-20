package level_0.parkjaeyong.q120816;

class Solution {
    public int solution(int slice, int n) {
        int answer ;
        for(answer=0 ; (answer * slice) < n ; answer++ );
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int ans = sol.solution(slice,n);
        System.out.println(ans);
    }
}

