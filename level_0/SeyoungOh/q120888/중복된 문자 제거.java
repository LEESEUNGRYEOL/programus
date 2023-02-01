
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class Solution {
     public static String solution(String my_string) {
        StringBuilder answer= new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (!list.contains(String.valueOf(my_string.charAt(i)))) {
                list.add(String.valueOf(my_string.charAt(i)));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer.append(list.get(i));
        }
        return String.valueOf(answer);
    }
}