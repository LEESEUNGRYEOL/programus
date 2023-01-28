package level_0.doyeonKim.q120905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0)
                list.add(num);
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        for (int num : list) {
            answer[idx++] = num;
        }

        return answer;
    }
}

// 스트림 사용
class Solution1 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}

/*
    n의 배수가 아닌 것들을 list에 넣어준다.
    List -> Array 로 변환해서 return
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(sol.solution(n, numlist)));
    }
}
