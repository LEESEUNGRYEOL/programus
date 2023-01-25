package level_0.LEESEUNGRYEOL.q120816;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12;
        int slice = 4;
        int answer = sol.solution(slice, n);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int slice, int n) {
       if(n % slice == 0 )
       {
           return n/slice;
       }
       else{
           return n/slice +1;
       }

    }
}