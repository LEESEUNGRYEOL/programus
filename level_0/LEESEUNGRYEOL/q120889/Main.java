package level_0.LEESEUNGRYEOL.q120889;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = new int[]{3,7,7};
        int answer = sol.solution(array);
        System.out.println(answer);
    }
}

class Solution {
    int max = 0;
    int max_index = 0;
    int another = 0;
    public int solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                max_index = i;
            }
        }

        for (int i = 0; i <array.length ; i++) {
            if (max_index != i)
            {
                another+= array[i];
            }
        }

        if(another > max)
        {
            return 1;
        }

        else{
            return 2;
        }

    }
}
