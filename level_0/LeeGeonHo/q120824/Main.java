package level_0.LeeGeonHo.q120824;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list= {1, 2, 3, 4, 5};
        System.out.println(sol.solution(num_list));
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==0){
                answer[0]++;
            }else {
                answer[1]++;
            }
        }
        return answer;
    }
}