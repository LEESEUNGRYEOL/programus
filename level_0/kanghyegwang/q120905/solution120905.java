package level_0.kanghyegwang.q120905;

/*
n의 배수 고르기
문제 설명
정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
1 ≤ numlist의 크기 ≤ 100
1 ≤ numlist의 원소 ≤ 100,000
입출력 예
n	numlist	                            result
3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	    [6, 9, 12]
5	[1, 9, 3, 10, 13, 5]	            [10, 5]
12	[2, 100, 120, 600, 12, 12]	        [120, 600, 12, 12]
입출력 예 설명
입출력 예 #1

numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다.
입출력 예 #2

numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
입출력 예 #3

numlist에서 12의 배수만을 남긴 [120, 600, 12, 12]를 return합니다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class solution120905 {
    public int[] solution(int n, int[] a) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x : a) {
            if (x % n == 0) arr.add(x);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        solution120905 T = new solution120905();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(a, b)) {
            System.out.print(x + " ");
        }
    }
}

/*
숫자 n 과 숫자 배열 a가 주어지고 배열 a에서 n의 배수인 숫자만 뽑아내는 문제
결과값의 배열 숫자가 정해지지 않아서 ArrayList를 사용
배열의 숫자를 for문으로 접근해서 n으로 나눠지는지 확인후 나눠지면 Arraylist에 추가
 */
