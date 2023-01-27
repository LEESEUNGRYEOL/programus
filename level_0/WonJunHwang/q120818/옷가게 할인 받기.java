class Solution {
    public int solution(int price) {
       
        int answer = 0;
        
        if(price >= 500000) {
            
            return (int)(price - (price * 0.2));    
            
        } else if(price >= 300000) {
            
            return (int)(price - (price * 0.1));
                    
        } else if(price >= 100000) {
          
            return (int)(price - (price * 0.05));
        
        }  else {
        
            return price;
            
        }
               
        
    }
}