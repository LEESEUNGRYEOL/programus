package level_0.KimNahyun.q120816;

import level_0.KimNahyun.q120815.Solution;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int slice = 7;
        int ans = sol.solution(slice,n);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int slice, int n) {
        int pizza = slice;

        while(true){
            if(pizza>=n){
                break;
            } else{
                pizza += slice;
            }
        }
        return pizza/slice;
    }
}