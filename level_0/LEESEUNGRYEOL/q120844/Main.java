package level_0.LEESEUNGRYEOL.q120844;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        int[] answer = sol.solution(numbers, direction);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length] ;
        int tmp;
        if(direction.equals("right"))
        {
            tmp = numbers[numbers.length -1];
            for (int i = 0; i < numbers.length -1 ; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = tmp;
        }
        else {
            tmp = numbers[0];
            for (int i = 1; i < numbers.length ; i++) {
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = tmp;
        }
        System.out.println(" = " +Arrays.toString(answer));

        return answer;
    }
}