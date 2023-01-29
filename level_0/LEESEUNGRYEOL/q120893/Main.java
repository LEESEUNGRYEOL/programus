package level_0.LEESEUNGRYEOL.q120893;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "cccCCC"	;
        String answer = sol.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] my_string_char = my_string.toCharArray();
//        System.out.println("my_string_char = " + Arrays.toString(my_string_char));
        for (int i = 0; i <my_string_char.length ; i++) {
            if(my_string_char[i]>='a' && 'z'>= my_string_char[i])
            {

                my_string_char[i] -= 32;
            }
            else
            {
                my_string_char[i] += 32;
            }
        }
//        System.out.println("my_string_char = " + Arrays.toString(my_string_char));
        answer = new String(my_string_char);
        return answer;
    }
}