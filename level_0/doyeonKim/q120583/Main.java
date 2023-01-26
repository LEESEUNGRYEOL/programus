package level_0.doyeonKim.q120583;

import java.util.Arrays;

// for문 사용하여 하나씩 비교하며 answer++
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for (int i : array) {
            if (i == n)
                answer++;
            else if (i > n)
                break;
        }
        return answer;
    }
}

// stream 사용해보기
class Solution1 {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(sol.solution(array, n));
    }
}
