package level_0.LEESEUNGRYEOL.q120826;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = new String("abcdeff");
        String letter = new String("f");


        String answer = sol.solution(my_string,letter);
        System.out.println(answer);
    }
}

class Solution{
    public String solution(String my_string, String letter) {
        String answer = new String();
        my_string = my_string.replace(letter,"");
        my_string = my_string.trim();
        answer = my_string;

        return answer;
    }
}
