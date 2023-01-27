package q120906;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 1234;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}

//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을
//return하도록 solution 함수를 완성해주세요

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1) 문자열 각 자리수를 개별로 나뉘어서 +
        // 2) 나머지 값으로 +
        while (n !=0) {
             answer += n%10;
            // 5 = 12345/10
            // 4+5 = 1234/10
            // 3+4+5 = 123/10
            // 2+3+4+5 = 12/10
            // 1+2+3+4+5 = 1/10
             n = n/10;
        }//종료가 될때까지 계속 반복
        return answer;
    }
}
