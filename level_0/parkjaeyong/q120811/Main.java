package level_0.parkjaeyong.q120811;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(new int[]{1, 2, 7, 10, 11});
        System.out.println("result = " + result);
    }
}

