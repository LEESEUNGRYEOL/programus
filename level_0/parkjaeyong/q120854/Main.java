package level_0.parkjaeyong.q120854;

import java.util.Arrays;

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(x -> x.length()).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int slice = 7;
        int n = 10;
        int[] ans = sol.solution(new String[]{"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(ans));

    }
}

