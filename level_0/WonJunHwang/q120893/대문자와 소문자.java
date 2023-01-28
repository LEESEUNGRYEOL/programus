import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] ch = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            
            ch[i] = my_string.charAt(i);
            
            if(Character.isUpperCase(ch[i])) {
                answer += Character.toLowerCase(ch[i]);
            } else {
                answer += Character.toUpperCase(ch[i]);
            }

        }
        return answer;
        
    }
}