import java.util.*;

class Solution {
    public int[] solution(String my_string) {
       
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
        
            if (Character.isDigit(ch)) {
                list.add(Character.getNumericValue(ch));
            }
            
        }
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }   
        
        return answer;

    }
}