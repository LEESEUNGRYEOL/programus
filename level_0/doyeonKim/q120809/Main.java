package level_0.doyeonKim.q120809;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        int idx = 0;
        for (int num : numbers)
            answer[idx++] = num * 2;
        return answer;
    }
}

// stream으로 풀어보기
class Solution1 {
    public int[] solution(int[] numbers) {
        return IntStream.of(numbers).map(i -> i * 2).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(sol.solution(numbers)));
    }
}

/*
    배열에서 각 원소의 값을 골라 변형시킬 수 있는지 확인하는 문제
    for문과 stream 두 가지 방법으로 풀어봤다.
    속도는 역시 for문이 훨씬 빠르다.
 */
