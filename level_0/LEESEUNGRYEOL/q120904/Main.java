package level_0.LEESEUNGRYEOL.q120904;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer;
        int num = 29183;
        int k= 1;
        answer = sol.solution(num,k);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int num, int k) {
        String tmp = "";
        tmp = Integer.toString(num);
        String[] tmp2;
        tmp2 = tmp.split("");

        System.out.println("tmp2 = " + Arrays.toString(tmp2));
        for (int i = 0; i <tmp2.length; i++) {
            if(tmp2[i].equals(String.valueOf(k)))
            {
                return i+1;
            }

        }
        return -1;
    }
}