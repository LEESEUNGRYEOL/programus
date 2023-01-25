import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
             
        int result = 0;
        
        Arrays.sort(numbers);
        
        result = numbers[numbers.length - 1] * numbers[numbers.length - 2];
                
        return result;
    }
}