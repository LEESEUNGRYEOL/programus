package level_0.LEESEUNGRYEOL.q120815;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int n) {
        int i = 1;
        while ((6 * i) % n != 0) {
            i++;
        }
        return i;

    }
}
