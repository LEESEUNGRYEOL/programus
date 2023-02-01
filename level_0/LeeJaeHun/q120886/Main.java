package src.lv0.q120886;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String before, String after) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < after.length(); i++) {
            list.add(String.valueOf(before.charAt(i)));
        }
        for (int i = 0; i < after.length(); i++) {

            int tmp = list.indexOf(String.valueOf(after.charAt(i)));
            if (tmp != -1) list.remove(tmp);
        }


        return list.size()==0?1:0;
    }
}

public class Main {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        Solution solution = new Solution();
        System.out.println(solution.solution(before,after));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
