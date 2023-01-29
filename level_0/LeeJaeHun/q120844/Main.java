package src.lv0.q120844;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {

        if(direction.equals("right")){
            int tmp = numbers[numbers.length-1];
            for (int i = numbers.length-2; i >=0 ; i--) {
                numbers[i+1] = numbers[i];
            }
            numbers[0] = tmp;
        }else{
            int tmp = numbers[0];
            for (int i=1 ; i <= numbers.length-1 ; i++) {
                numbers[i-1] = numbers[i];
            }
            numbers[numbers.length-1] = tmp;
        }
        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(numbers,direction)));
    }

}
