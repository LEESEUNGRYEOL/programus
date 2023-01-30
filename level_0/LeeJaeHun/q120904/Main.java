package src.lv0.q120904;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {

        int answer = 0;
        int[] sNum = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < sNum.length; i++) {
            if(sNum[i]==k){
                return i+1;

            }
        }
        return -1;

    }
}

public class Main {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.solution(num,k));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
