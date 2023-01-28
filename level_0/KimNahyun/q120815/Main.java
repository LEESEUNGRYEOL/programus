package level_0.KimNahyun.q120815;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int ans = sol.solution(n);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int pizza = 6;

        while(true){
            if(pizza%n == 0){
                break;
            } else{
                pizza += 6;
            }
        }
        return pizza/6;
    }
}