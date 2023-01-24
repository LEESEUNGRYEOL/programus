package level_0.LEESEUNGRYEOL.q120585;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = new int[]{149, 180, 192, 170};
        int height = 167;
        int answer = sol.solution(array, height);
        System.out.println(answer);
    }
}

class Solution {
    int answer = 0;
    public int solution(int[] array, int height) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }

        return answer;
    }
}
