package level_0.doyeonKim.q120899;

import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0, max = 0;
        for (int a : array) {
            map.put(a, idx++);
            max = Math.max(max, a);
        }

        return new int[] {max, map.get(max)};
    }
}

/*
    1. map에 array에 값과 인덱스를 저장한다.
    2. map에 저장하면서 max 값을 구한다.
    3. map에서 max의 인덱스를 찾는다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(sol.solution(array)));
    }
}
