package level_0.LEESEUNGRYEOL.q120847;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[]{1,2,3,4,5};

        int answer = sol.solution(numbers);
        System.out.println(answer);
    }
}

class Solution {
    int answer;
    int max = 0;
    public int solution(int[] numbers) {
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if(numbers[i]*numbers[j] > max)
                {
                    max = numbers[i]*numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }
}
