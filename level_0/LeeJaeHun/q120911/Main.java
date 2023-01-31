package src.lv0.q120911;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }

    public String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArr =my_string.toLowerCase().toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length; i++) {
            sb.append(charArr[i]);
        }
        return  sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
//        String my_string = "Bcad";
        String my_string = "heLLo";
//        String my_string = "Bcad";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));

    }

}
