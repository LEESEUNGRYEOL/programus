package level_0.LeeGeonHo.q120813;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}

class Solution {
    public int[] solution(int n) {
        int[] answer;
        int idx =0;

        if(n%2==0){
            answer = new int[n/2];
        }else{
            answer = new int[n/2+1];
        }

        for(int i=1; i<=n; i++){
            if(i%2==1){
                answer[idx]=i;
                idx++;
            }
        }
        return answer;
    }
}