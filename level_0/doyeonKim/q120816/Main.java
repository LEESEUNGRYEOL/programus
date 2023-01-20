package level_0.doyeonKim.q120816;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 14;
        System.out.println(sol.solution(slice, n));
    }
}

class Solution {
    public int solution(int slice, int n) {
        return countPizza(n, slice, 1);
    }

    int countPizza(int num, int slice, int cnt) {
        if (num <= slice)
            return cnt;
        else
            return countPizza(num - slice, slice, ++cnt);
    }
}
