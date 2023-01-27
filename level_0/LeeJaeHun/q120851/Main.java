package src.lv0.q120851;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string) {

        return Arrays.stream(String.valueOf(my_string.replaceAll("[a-zA-Z]","")).split("")).mapToInt(Integer::parseInt).sum();
    }

}

public class Main {
    public static void main(String[] args) {
        String n ="aAb1B2cC34oOp";
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }

}
