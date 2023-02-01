class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n ; i++) {
            if (composite(i)) answer++;
        }
        return answer;
    }

    static boolean composite(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ++cnt;
            }
            if (cnt == 3) {
                break;
            }
        }
        if(cnt==3) return true;
        else return false;
    }
}