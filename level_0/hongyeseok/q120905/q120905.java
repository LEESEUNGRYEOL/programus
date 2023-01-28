package level_0.hongyeseok.q120905;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 설명
 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
 * numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 크기 ≤ 100
 * 1 ≤ numlist의 원소 ≤ 100,000
 *
 * 입출력 예
 * n	numlist	                            result
 * 3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	    [6, 9, 12]
 * 5	[1, 9, 3, 10, 13, 5]	            [10, 5]
 * 12	[2, 100, 120, 600, 12, 12]	        [120, 600, 12, 12]
 */
public class q120905 {
    public static void main(String[] args) {
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Solution.solution(3,numlist));
    }
}
class Solution {
    public static List<Integer> solution(int n, int[] numlist) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){
                intList.add(numlist[i]);
            }
        }
        return intList;
    }
}