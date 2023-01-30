package level_0.kanghyegwang.q120897;
/*
약수 구하기
문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
입출력 예 설명
입출력 예 #1

24의 약수를 오름차순으로 담은 배열 [1, 2, 3, 4, 6, 8, 12, 24]를 return합니다.
입출력 예 #2

29의 약수를 오름차순으로 담은 배열 [1, 29]를 return합니다.
*/

import java.util.ArrayList;
import java.util.List;

class solution120897 {
    public int[] solution(int n) {
        // 약수를 저장할 리스트 생성
        List<Integer> list = new ArrayList<>();
        // n을 나눌 i변수
        int i=1;
        // 무한반복
        while (true) {
            // n을 i로 나눴을때 나누어 떨어지면 약수
            if (n % i == 0) {
                // 약수면 리스트에 추가
                list.add(i++);
            } else {
                // 약수가 아니면 i값만 증가
                i++;
            }
            // i값이 n보다 커지면 반복 종료
            if (i > n) break;
        }
        // 정답배열을 list의 크기로 생성
        int[] answer = new int[list.size()];
        // 정답배열에 list의 값 대입
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}
