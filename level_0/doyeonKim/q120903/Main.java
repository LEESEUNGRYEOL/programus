package level_0.doyeonKim.q120903;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        Solution sol = new Solution();
//        Solution1 sol = new Solution1();
//        Solution2 sol = new Solution2();
        System.out.println(sol.solution(s1, s2));
    }
}

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

class Solution1 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> strList = new ArrayList<>(Arrays.asList(s1));

        for (String string : s2) {
            if (strList.contains(string))
                answer++;
        }

        return answer;
    }
}

class Solution2 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        HashSet<String> set = new HashSet<>(List.of(s1));

        for (String string : s2) {
            if (set.contains(string))
                answer++;
        }

        return answer;
    }
}
