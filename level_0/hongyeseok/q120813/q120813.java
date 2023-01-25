package level_0.hongyeseok.q120813;

import java.util.Arrays;

/**
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 입출력
 * n	result
 * 10	[1, 3, 5, 7, 9]
 * 15	[1, 3, 5, 7, 9, 11, 13, 15]
 */
public class q120813 {
    public static void main(String[] args) {
        int n = 10;
        int[] answer = Solution.solution(n);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public static int[] solution(int n) {
        int[] oddNumbers = new int[Math.round((float) n/2)];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                oddNumbers[j] = i;
                j++;
            }
        }
        Arrays.sort(oddNumbers);
        return oddNumbers;
    }
}