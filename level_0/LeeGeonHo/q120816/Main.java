package level_0.LeeGeonHo.q120816;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice= 7;
        int n =10;
        System.out.println(sol.solution(n,slice));
    }
}

class Solution {
    public int solution(int n, int slice) {
        int answer =0;
        if(n%slice>0){
            answer= n/slice+1;
        }else if(n%slice==0){
            answer=n/slice;
        }
        return answer;
    }
}