class Solution {
    public String solution(String rsp) {
        
        String answer = "";
        
        String[] rspArr = rsp.split("");
        
        for(int i = 0; i < rspArr.length; i++) {
            
            if(rspArr[i].equals("2")) {
                answer += "0";
            }

            if(rspArr[i].equals("0")) {
                answer += "5";
            }

            if(rspArr[i].equals("5")) {
                answer += "2";
            }
          
            
        }
        
        
        return answer;
        
   }
}