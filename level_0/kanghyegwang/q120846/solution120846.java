package level_0.kanghyegwang.q120846;

/*
합성수 찾기
문제 설명
약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	5
15	8
입출력 예 설명
입출력 예 #1

10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
입출력 예 #1

15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
 */

public class solution120846 {
    public int solution(int n) {
        int res = 0;
        // n이하의 자연수
        for (int i = 1; i <= n; i++) {
            // 약수의 개수를 카운트
            int cnt = 0;
            // 자연수를 나눌 j
            for (int j = 1; j <= i; j++) {
                // i 를 j 로 나눈 값이 0 이면 i의 약수 카운트
                if (i % j == 0) cnt++;
            }
            // 약수가 3개 이상이면 카운트
            if (cnt >= 3) res++;
        }
        return res;
    }
}
