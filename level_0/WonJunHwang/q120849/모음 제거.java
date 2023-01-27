import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < vowel.length; i++) {
			
            if( my_string.contains(vowel[i])) {
			
                answer = my_string.replaceAll(vowel[i], "");
				my_string = answer;
	
            } else {
                answer = my_string;
            }
		}
                
        return answer;
    }
}