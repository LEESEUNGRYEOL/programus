package level_0.hongyeseok.q120824;

public class q120824 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution.solution(num_list));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int i = 0; i < num_list.length; i ++){
            if (num_list[i]%2==0){
                answer[0]++;
            } else if(num_list[i]%2==1){
                answer[1]++;
            }
        }
        return answer;
    }
}