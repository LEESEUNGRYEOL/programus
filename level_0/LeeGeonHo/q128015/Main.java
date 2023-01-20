package level_0.LeeGeonHo.q128015;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n= 4;
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int box = 6;
        while (box % n != 0) {
            box += 6;
        }
        return box / 6;
    }
}