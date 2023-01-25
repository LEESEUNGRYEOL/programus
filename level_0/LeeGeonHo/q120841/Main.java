package level_0.LeeGeonHo.q120841;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] dot = {2,4};
        System.out.println(sol.solution(dot));
    }
}

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0) {
            answer =1;
        } else if (dot[0]>0 && dot[1]<0) {
            answer = 4;
        } else if(dot[0]<0 && dot[1]>0) {
            answer = 2;
        }else if(dot[0]<0 && dot[1]<0){
            answer = 3;
        }
        return answer;
    }
}