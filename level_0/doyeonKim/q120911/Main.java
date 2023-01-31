package level_0.doyeonKim.q120911;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
    }
}

class Solution1 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        my_string = my_string.toLowerCase();
        String[] str = my_string.split("");
        Arrays.sort(str);
        for (String s : str)
            sb.append(s);

        return sb.toString();
    }
}

/*
    1. ""으로 한글자씩 나눈다.
    2. 모두 소문자로 바꾼다. (toLowerCase)
    3. 정렬한다.
    4. 글자를 합친다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "Bcad";
        System.out.println(sol.solution(my_string));
    }
}
