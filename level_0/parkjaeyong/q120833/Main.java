package level_0.parkjaeyong.q120833;


import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] ans = sol.solution(new int[]{1, 2, 3, 4, 5},1, 3);
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
    }
}

