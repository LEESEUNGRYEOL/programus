package src.lv0.q120888;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        return Arrays.stream(my_string.split("")).reduce("", (a, b) -> a + (b = (!a.contains(b)) ? b : "")).toString();
//        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }
    public String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] arr =my_string.split("");
        for (int i = 0; i <arr.length ; i++) {
            if (sb.indexOf(arr[i])==-1){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string = "people";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
