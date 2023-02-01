package level_0.doyeonKim.q120838;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();

        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < mos.length; i++) {
            map.put(mos[i], alphabet[i]);
        }

        String[] letterArr = letter.split(" ");
        for (String l : letterArr) {
            sb.append(map.get(l));
        }
        return sb.toString();
    }
}




public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String letter = ".... . .-.. .-.. ---";
        System.out.println(sol.solution(letter));
    }
}
