import java.util.Arrays;

class Solution {
    public static int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        Arrays.sort(numbers);
        answer=Math.max(numbers[0] * numbers[1],numbers[numbers.length - 1] * numbers[numbers.length - 2]);
        return answer;
    
    }
}