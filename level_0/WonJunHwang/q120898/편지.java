class Solution {
    public int solution(String message) {
        int answer = 0;
        
        char[] letter = message.toCharArray();
        
        for (int i = 0; i < letter.length; i++) {
            answer += 2;            
        }
        
        
        return answer;
    }
}