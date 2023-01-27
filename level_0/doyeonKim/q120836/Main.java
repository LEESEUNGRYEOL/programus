package level_0.doyeonKim.q120836;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += n % i == 0 ? 1 : 0;   // 약수 구하기. n이 i로 나눠지면 answer 값을 1 늘린다.
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);  // n의 제곱근 구하기
        for (int i = 1; i <= (int) sqrt; i++) { // n의 제곱근까지만 for 문 돌면서 약수 구하면 된다. 제곱근까지 돌면서 구한 개수에 2를 곱하면 된다.
            if (i * i == n) answer++;  // i가 n의 제곱근인 경우는 하나이므로 1을 더한다.
            else if (n % i == 0) answer += 2;  // i가 n의 약수인 경우, 순서쌍이므로 2를 더한다.
        }
        return answer;
    }
}

// stream 사용
// 1 ~ n 까지의 int 값을 가진 stream을 만든다.
// (n % i == 0)인 요소들만 고른다.
// 카운트한다.
class Solution2 {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}

/*
    순서쌍의 개수 = n의 약수의 개수
    for문을 돌면서 나눠지는 경우를 구한다.
 */

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
        Solution2 sol = new Solution2();
        int n1 = 20;
        int n2 = 100;
        System.out.println(sol.solution(n1));
        System.out.println(sol.solution(n2));
    }
}
