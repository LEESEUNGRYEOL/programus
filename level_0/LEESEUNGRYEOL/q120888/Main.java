package level_0.LEESEUNGRYEOL.q120888;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "people";
        String answer = sol.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int cnt = 0;
        ArrayList <Character> tmp = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            for (char c : tmp) {
                if (c == my_string.charAt(i)) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                tmp.add(my_string.charAt(i));
            }
            cnt = 0;
        }
        for(char i:tmp)
        {
            answer+=i;
        }

        return answer;
    }
}