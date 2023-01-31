import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
//         String reverse = "";
//         for(int i = beforeArr.length - 1; i >= 0; i--) {
//             reverse += beforeArr[i];            
            
//             if(after.equals(reverse)) {
//                 return 1;   
//             } 
        
//         }
        
//         return 0;
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        String beforeStr = new String(beforeArr);
        String afterStr = new String(afterArr);
        
        if(beforeStr.equals(afterStr)) {
            return 1;
        } else {
            return 0;
        }
        
    }
}