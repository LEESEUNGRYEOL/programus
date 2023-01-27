package level_0.JoMinSung.q120909;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 144;
        int ans = sol.solution(n);
        System.out.println(ans);

    }
}
class Solution {
    public int solution(int n) {
        /*
        double answer = (int)Math.sqrt(n);

        return answer * answer == n ? 1 : 2;
        */


        int answer = 0;
        double sqrt = (int)Math.sqrt(n); // Math.sqrt는 제곱수를 구하는 코드 이게 double이 실수 값이라 제곱수를 실수값으로 뽑으면 언젠가는 제곱수가 나오기 때문에
                                        // int 정수로 바꿔서 그 가능성을 줄이는걸로 바꿔줫음


        if (sqrt * sqrt == n) {
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}
