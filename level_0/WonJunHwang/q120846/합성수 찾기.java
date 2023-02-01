import java.util.*;

class Solution {
    public int solution(int n) {
       
        int answer = 0;
        // int count = 0;
//         int[] array = new int[n];
        
//         Set set = new HashSet();
        
        for(int i = 1; i <= n; i++) {
            
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count >= 3) {
                answer++;
            }
            
            
        }
               
        return answer;
    }
}