class Solution {
    public int solution(int n) {
                  
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            
//             for(int j = n; j >= 1; j--) {
                
//                 if(i * j == n) {
//                     count++;
//                 }
                
//             }
            
            if(n % i == 0) {
                count++;
            }
            
            
        }
        
        
        
        return count;
    }
}