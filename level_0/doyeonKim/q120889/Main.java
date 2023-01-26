package level_0.doyeonKim.q120889;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); // sides 배열 정렬
        if (sides[2] < sides[0] + sides[1]) // 가장 긴 변 < 다른 두 변의 합
            return 1;
        else
            return 2;
    }
}

// 삼항 연산자 사용
class Solution1 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return (sides[2] < sides[0] + sides[1]) ? 1 : 2;
    }
}

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        int[] sides = {3, 6, 2};
        System.out.println(sol.solution(sides));
    }
}
