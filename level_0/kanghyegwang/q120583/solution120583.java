/*
문제 설명
정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array의 원소 ≤ 1,000
0 ≤ n ≤ 1,000
입출력 예
array	            n	result
[1, 1, 2, 3, 4, 5]	1	2
[0, 2, 3, 4]	    1	0
 */

class solution120583 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int x : array) {
            if (x == n) answer++;
        }
        return answer;
    }
}

/*
배열의 요소를 하나하나씩 꺼내서 비교할 수 만 있으면 쉽게 풀수 있는 문제다
그리고 요소를 하나씩 꺼내서 n과 비교만 하면 되서 for(int i = 0; i < array.length; i++) 의 for문을 쓰는 것 보다
향상된 for문을 사용하는것이 가독성도 좋고 훨씬 효율적이다.
 */