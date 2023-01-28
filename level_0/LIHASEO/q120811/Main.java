package level_0.LIHASEO.q120811;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr2 = {-6, -2, 7, 9, 12};
        int ans = sol.solution(arr2);
        System.out.println(ans);
    }
}

class Solution {
    int answer;
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}