package level_0.LeeGeonHo.q120818;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int price = 150000;
        int ans = sol.solution(price);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price>=500000){
            answer = (int)(price*0.8);
        }else if (price >=300000 && price <500000){
            answer = (int)(price * 0.9);
        }else if (price>=100000 && price <300000){
            answer = (int)(price*0.95);
        }else {
            answer= price;
        }
        return answer;
    }
}