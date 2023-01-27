package level_0.kanghyegwang.q120813;
/*
문제 설명
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
 */
import java.util.*;
import java.util.stream.Stream;
class solution120813 {
    public int[] solution(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}

/*
for 문은 1부터 돌리고
List 에 홀수인 숫자를 추가해주고 스트림을 통해 int[]로 다시 반환하는 형식으로 코드를 짜 봤다.
정렬도 해야하기에 for문으로 순차적으로 돌리면서 답을 구하면 쉽게 구할수 있는 문제인거같다.
 */