package level_0.LEESEUNGRYEOL.q120905;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayList answer = sol.solution(n, numlist);
        System.out.println(answer);
    }
}

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList <Integer> answer = new ArrayList<>();
        for (int i: numlist)
        {
            if(i % n == 0)
            {
                answer.add(i);
            }
        }

        return answer;
    }
}