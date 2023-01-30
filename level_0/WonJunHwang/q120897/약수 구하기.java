import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int[] answer = {};

        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++) {
            
            if (n % i == 0) {
                list.add(i);
            }
        }
        
        answer = new int[list.size()];

        int index = 0;

        for(int number : list) {

          answer[index++] = number;

        }
        
        return answer;
        
    }
    
}