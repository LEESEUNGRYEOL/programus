package level_0.kanghyegwang.q120823;

/*
직각삼각형 출력하기
문제 설명
"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

제한사항
1 ≤ n ≤ 10
입출력 예
입력 #1

3
출력 #1

*
**
***
입출력 예 설명
입출력 예 #1

n이 3이므로 첫째 줄에 * 1개, 둘째 줄에 * 2개, 셋째 줄에 * 3개를 출력합니다.
 */

import java.util.Scanner;

public class solution120823 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

/*
별찍기 문제중 별을 직각삼각형으로 출력하는 문제
2중 for문을 사용해서 첫번째 for문은 주어지는 숫자만큼 반복해서 직각삼각형의 높이값을 출력
두번째 for문은 0부터 주어진 숫자까지의 길이값을 출력하게 만들어 순차적으로 삼각형을 만들게 함
 */
