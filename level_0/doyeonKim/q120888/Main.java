package level_0.doyeonKim.q120888;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] str = my_string.split("");
        for (String s : str) {
            if (!list.contains(s)) {
                list.add(s);
                sb.append(s);
            }
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_stirng = "people";
        System.out.println(sol.solution(my_stirng));
    }
}
