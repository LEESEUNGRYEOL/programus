package level_0.doyeonKim.q120846;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) { // 1, 2, 3은 합성수가 아니므로 4부터 시작
            if (isComposite(i)) answer++;
        }

        return answer;
    }

    private boolean isComposite(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cnt++;
            if (cnt >= 3)
                return true;
        }
        return false;
    }
}

/*
    약수의 개수가 3개 이상인 수 - 합성수
    1~n까지 반복하면서 약수의 개수가 3 이상이 되면 answer++
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        System.out.println(sol.solution(n));
    }
}
