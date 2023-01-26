package level_0.JoMinSung.q120906;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 930211;
        int ans = sol.solution(n);
        System.out.println(ans);

    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0){ // while의 조건이 참이면 거짓이 될때까지 계속 밑에값이 돌아감
            answer += n%10; // n값의 1의자리수 나머지를 한개씩 더해주고 위에 참값이 거짓이 되면 끝
            n/=10;           // n값을 10으로 나누면 1의 자리수가 나머지로 남음
        }
        return answer;
    }
}