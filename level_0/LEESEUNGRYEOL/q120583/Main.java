package level_0.LEESEUNGRYEOL.q120583;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = new int[] {1,1,2,3,4,5};
        int n = 1;

        int answer = sol.solution(array,n);
        System.out.println(answer);
    }
}

class Solution{
    public int solution(int[] array, int n) {
        int cnt =0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == n) cnt++;
        }
        return cnt;
    }
}
