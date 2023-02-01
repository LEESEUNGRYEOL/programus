package level_0.LEESEUNGRYEOL.q120911;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Bcad";
        String answer = sol.solution(my_string);
        System.out.println(answer);
    }
}
class Solution {
    public String solution(String my_string) {
        String temp = "";
        String answer = "";
        char[] tmp;
        temp = my_string.toLowerCase();
        tmp = temp.toCharArray();
        Arrays.sort(tmp);

        for(char i: tmp){
            answer+=i;
        }

        return answer;
    }
}