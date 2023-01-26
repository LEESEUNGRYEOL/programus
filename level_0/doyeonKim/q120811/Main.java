package level_0.doyeonKim.q120811;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

/*
    크기를 비교해서 값을 찾는 문제 -> 정렬부터 한다.
 */


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};
        System.out.println(sol.solution(array1));
        System.out.println(sol.solution(array2));
    }
}

