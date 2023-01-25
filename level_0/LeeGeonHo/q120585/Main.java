package level_0.LeeGeonHo.q120585;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array	= {149, 180, 192, 170};
        int height = 167;
        System.out.println(sol.solution(array,height));
    }
}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i =0; i<array.length; i++){
            if(array[i] > height){
                answer ++;
            }
        }
        return answer;
    }
}