package src.lv0.q120891;

import java.util.Arrays;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] sOrder = String.valueOf(order).split("");
        for (int i = 0; i < sOrder.length; i++) {
            if(sOrder[i].equals("3")||sOrder[i].equals("6")||sOrder[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
    public int solution2(int order) {
        return (int)Arrays.stream(String.valueOf(order).split("")).mapToInt(Integer::parseInt).filter(i->i==3||i==6||i==9).count();
    }
}

public class Main {
    public static void main(String[] args) {
        int order= 29423;
        Solution solution = new Solution();
        System.out.println(solution.solution(order));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
