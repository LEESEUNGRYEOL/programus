package level_0.LEESEUNGRYEOL.q120850;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hi12392";
        ArrayList answer = sol.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList <Integer> answer  = new ArrayList<>();
        for (int i = 0; i < my_string.length() ; i++) {
            if(my_string.charAt(i) >= '0' &&my_string.charAt(i)<= '9')
            {
                answer.add ((my_string.charAt(i))-'0');
            }
        }
//        System.out.println("answer = " + answer);
        answer.sort(Comparator.naturalOrder());
        return answer;
    }
}
