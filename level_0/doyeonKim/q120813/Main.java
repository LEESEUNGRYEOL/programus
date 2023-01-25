package level_0.doyeonKim.q120813;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = n % 2 == 0 ? new int[n / 2] : new int[n / 2 + 1];  // 배열 크기를 짝수인 경우, 홀수인 경우 나눔
        for (int i = 1, idx = 0; i <= n; i++) {
            if (i % 2 != 0)  // 홀수일때만
                answer[idx++] = i;  // answer에 넣는다.
        }
        return answer;
    }
}

class Solution1 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();  // List를 사용하면 배열 크기 정하지 않아도 된다.
        for (int i = 1; i <= n; i++)
            if (i % 2 != 0)
                list.add(i);

        return list.stream().mapToInt(Integer::intValue).toArray();  // 대신, list를 int 배열로 바꾸는게 조금 까다로워진다.
    }
}

class Solution2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 1).toArray();  // Intstream 사용. 0~n까지 스트림 만들고 홀수인 것들만 배열로 만들어 리턴
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
//        Solution2 sol = new Solution2();
        int n = 15;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
}


/*
배열의 인덱스와 원소 값 설정 문제
속도는 for문 사용한 Solution이 제일 빠르고
stream 연산한 Solution2가 제일 느리다.
 */