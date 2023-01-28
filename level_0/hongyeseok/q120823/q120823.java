package level_0.hongyeseok.q120823;
import java.util.Scanner;
/**
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 * 입출력 예
 * 입력 #1
 *
 * 3
 * 출력 #1
 *
 * *
 * **
 * ***
 */
public class q120823 {
    public static void main(String[] args) {

    }
}


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}