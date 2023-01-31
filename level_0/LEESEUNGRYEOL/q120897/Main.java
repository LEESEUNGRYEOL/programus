package level_0.LEESEUNGRYEOL.q120897;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n =24;
        ArrayList answer = sol.solution(n);
        System.out.println(answer);
    }
}

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList <Integer> tmp = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0)
            {
                tmp.add(i);
            }
        }
        System.out.println("tmp = " + tmp);
        return tmp;
    }
}