package level_0.LeeGeonHo.q120847;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sol.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int length = numbers.length;
        Arrays.sort(numbers);
        answer= numbers[length-1]*numbers[length-2];
        return answer;
    }
}