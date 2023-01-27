class Solution {
    public String solution(String my_string, String letter) {
                
        String answer = my_string.replaceAll(letter, "");
        
//         char[] word = my_string.toCharArray();
        
//         for(int i = 0; i < word.length; i++) {
            
//             if(letter.equals(word[i])) {
//                 word[i] = '';
//             }
//             answer = new String(word);
//         }
                
        return answer;
    }
}