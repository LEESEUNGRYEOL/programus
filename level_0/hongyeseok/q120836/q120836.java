package level_0.hongyeseok.q120836;

import java.util.ArrayList;
import java.util.List;

/**
 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
 * 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 입출력
 * n	result
 * 20	6
 * 100	9
 */
public class q120836 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(20));
    }
}

//순서쌍의 갯수 == 약수의 갯수
class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                answer++;
            }
        }
        return answer;
    }
}