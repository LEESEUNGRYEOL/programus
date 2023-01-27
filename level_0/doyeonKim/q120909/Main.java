package level_0.doyeonKim.q120909;

class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt(n); // 제곱근 구하기
        return (int)sqrt * (int)sqrt == n ? 1 : 2;
    }
}

/*
    제곱근을 구하고 int로 변환, 제곱근 * 제곱근 = n 이라면, n은 제곱수
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 144;
        int n2 = 976;
        System.out.println(sol.solution(n1));
        System.out.println(sol.solution(n2));
    }
}
