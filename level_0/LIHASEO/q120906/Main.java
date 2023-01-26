package level_0.LIHASEO.q120906;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(52);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int mod = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            mod += str.charAt(i) - '0';
//            int div = 10^i;
//            if (n / div  <= 0) {
//            }
        }
        int answer = mod;
        return answer;
    }
}
