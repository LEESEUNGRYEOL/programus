package level_0.LeeGeonHo.q120811;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 2, 7, 10, 11};
        int ans = sol.solution(array);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = 0;

        answer = array[array.length/2];
        return answer;
    }
}