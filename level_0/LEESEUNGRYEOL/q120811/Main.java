package level_0.LEESEUNGRYEOL.q120811;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int answer;
        int[] array = {1,2,3,4,5};

        answer = sol.solution(array);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return (array[array.length/2]);
    }
}
