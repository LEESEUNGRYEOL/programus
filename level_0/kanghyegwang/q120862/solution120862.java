package level_0.kanghyegwang.q120862;

/*
최댓값 만들기 (2)
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers 의 길이 ≤ 100
입출력 예
numbers	                    result
[1, 2, -3, 4, -5]	        15
[0, -31, 24, 10, 1, 9]	    240
[10, 20, 30, 5, 5, 20, 5]	600
입출력 예 설명
입출력 예 #1

두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
입출력 예 #2

두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
입출력 예 #3

두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
 */

import java.util.Arrays;

public class solution120862 {
    public int solution(int[] a) {
        int res = 0;
        // a 배열 기본 정령
        Arrays.sort(a);
        // a의 요소들중 음수값이 있을수도 있으니 -값과 -값의 곱도 가장 큰값이 될 수 있음
        int n1=a[0]*a[1];
        // 정렬후 가장 큰값이 마지막에 와서 마지막값과 그 바로앞의 값을 곱
        int n2=a[a.length-1]*a[a.length-2];
        // 삼항연산자 또는 if else로 n1 과 n2 의 크기를 비교하여 큰값 반환
        res = n1 > n2 ? n1 : n2;
        return res;
    }
}
