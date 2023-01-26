package level_0.hongyeseok.q120906;

/**
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * 입출력
 * n	    result
 * 1234	    10
 * 930211	16
 */
public class q120906 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(1234));
    }
}
class Solution {
    public static int solution(int n) {
        int answer = 0;
        while (n != 0){
            answer += n%10;
            n/=10;
        }
        return answer;
    }
}