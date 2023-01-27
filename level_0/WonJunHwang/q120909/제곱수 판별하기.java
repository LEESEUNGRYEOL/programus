class Solution {
    public int solution(int n) {
        
        int sqrtNumber = (int)Math.sqrt(n);
        
        if(sqrtNumber * sqrtNumber == n) {
            return 1;
        } else {
            return 2;
        }
           
        
    }
}