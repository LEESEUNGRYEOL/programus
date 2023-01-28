package level_0.parkjaeyong.q120905;


import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.solution(5 , new int[]{1, 9, 3, 10, 13, 5});
//        System.out.println(ans);
        System.out.println(Arrays.toString(ans));
    }
}

