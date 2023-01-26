package level_0.LIHASEO.q120906;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(20);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int mod, modsum = 0;
        n = 294;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            mod = n % (10^i);

            modsum += mod;
            System.out.println(modsum);
        }
        int answer = modsum;
        return answer;
    }
}
