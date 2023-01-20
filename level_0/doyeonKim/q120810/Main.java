package level_0.doyeonKim.q120810;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num1 = 10;
        int num2 = 3;
        int ans = sol.soultion(num1, num2);
        System.out.println(ans);
    }
}

class Solution{
    public int soultion(int num1, int num2) {
        return num1 % num2;
    }
}

