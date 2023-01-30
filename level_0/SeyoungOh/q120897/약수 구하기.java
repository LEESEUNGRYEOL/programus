import java.util.ArrayList;

import java.util.List;
class Solution {
    public static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}