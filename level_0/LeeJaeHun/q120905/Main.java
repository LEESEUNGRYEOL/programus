package src.lv0.q120905;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {

        return Arrays.stream(numlist).filter(i->i%n==0).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution(n,numlist)));
    }

}
