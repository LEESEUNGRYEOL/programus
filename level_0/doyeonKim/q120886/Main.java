package level_0.doyeonKim.q120886;

import java.util.*;

class Solution {
    public int solution(String before, String after) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : before.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : after.split("")) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() != 0)
                return 0;
        }

        return 1;
    }
}

class Solution1 {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        return (Arrays.equals(beforeArr, afterArr)) ? 1 : 0;

    }
}

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        String before = "olleh";
        String after = "hello";
        System.out.println(sol.solution(before, after));
    }
}
