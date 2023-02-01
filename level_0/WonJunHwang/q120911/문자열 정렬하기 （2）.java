import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String str = my_string.toLowerCase();
        
        char[] ch = str.toCharArray();
        
        Arrays.sort(ch);
        
        answer = String.valueOf(ch);
        
        return answer;
    }
}