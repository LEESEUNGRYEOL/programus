package src.lv0.q120845;

import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box).reduce(1,(a,b)->a*(b/n));
    }
}

public class Main {
    public static void main(String[] args) {
        int[] box={10,8,6};
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.solution(box,n));
    }

}
