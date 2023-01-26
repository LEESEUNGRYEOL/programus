package level_0.kanghyegwang.q120906;

/*
문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

제한사항
0 ≤ n ≤ 1,000,000
입출력 예
n	        result
1234	    10
930211	    16
입출력 예 설명
입출력 예 #1

1 + 2 + 3 + 4 = 10을 return합니다.
입출력 예 #2

9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */

public class solution120906 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}

/*
주어진 숫자를 각각 하나씩 더하는 문제이다
다섯자리 숫자를 하나씩 때서 더하는 방법을 알고있는지 물어보는 문제이고 나머지 % 연산을 이해하고 있다면 크게 문제없이 문제를 해결할수 있다.
 */
