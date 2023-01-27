import java.util.Arrays;
class Solution {
     public int solution(int[] numbers) {
        int answer = 0;
        int i;
        for (i = 0; i <= 9; i++){
            String nbs = Arrays.toString(numbers); 
            String inum = String.valueOf(Integer.valueOf(i)); 
            
            if(!nbs.contains(inum)) {
                answer += i;
            }
        }
        return answer;
    }
}