package level_0.LEESEUNGRYEOL.q120838;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String n = ".... . .-.. .-.. ---";
        String  answer = sol.solution(n);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String letter) {
        HashMap<Integer, String> map = new HashMap<>();//new에서 타입 파라미터 생략가능
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String answer = "";

        for (String i : letter.split(" ")) {
            for (int j = 0; j < morse.length; j++) {
                if(morse[j].equals(i))
                {
                    answer += (char)(j+97);
                }
            }
        }
        return answer;
    }
}