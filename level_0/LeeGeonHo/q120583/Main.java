package level_0.LeeGeonHo.q120583;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array	= {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(sol.solution(array,n));
    }
}

class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for(int i=0; i<array.length; i++){
                if(array[i]==n){
                    answer++;
                }
            }
            return answer;
        }
    }