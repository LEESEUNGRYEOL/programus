
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public static void main(String[] args) {
        System.out.println(solution("hi12392"));
    }
    public static List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                list.add(c-48);
            }
        }
        Collections.sort(list);
        return list;
    }
}