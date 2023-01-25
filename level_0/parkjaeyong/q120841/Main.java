package level_0.parkjaeyong.q120841;


class Solution {
    public int solution(int[] dot) {
        return dot[0] > 0 ? dot[1] > 0 ? 1 : 4 : dot[1] > 0 ? 2 : 3 ;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.solution(new int[]{2, 4});
        System.out.println(ans);
    }
}

