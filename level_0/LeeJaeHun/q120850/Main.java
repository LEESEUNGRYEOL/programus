package src.lv0.q120850;

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        return Arrays.stream(String.valueOf(my_string).replaceAll("[a-z]","").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string = "p2o4i8gj2";
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(my_string)));
    }

}
