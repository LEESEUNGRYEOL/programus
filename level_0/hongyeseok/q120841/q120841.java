package level_0.hongyeseok.q120841;

public class q120841 {
    public static void main(String[] args) {
        int[] dot = {2,4};
        Solution solution = new Solution();
        System.out.println(solution.solution(dot));

    }
}

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0){
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0){
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }
        return answer;
    }
}
