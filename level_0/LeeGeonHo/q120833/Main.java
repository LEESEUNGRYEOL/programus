package level_0.LeeGeonHo.q120833;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(sol.solution(numbers,num1,num2)));
    }
}

class Solution{
    public int[] solution(int[]numbers, int num1, int num2){
        int[] answer = new int[num2];
        answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}