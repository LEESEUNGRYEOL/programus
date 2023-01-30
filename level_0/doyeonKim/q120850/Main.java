package level_0.doyeonKim.q120850;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch))
                list.add(Character.getNumericValue(ch));
        }
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}

// 스트림 사용
class Solution1 {
    public int[] solution(String my_string) {
        return my_string.chars()
                .filter(Character::isDigit)
                .mapToObj(Character::getNumericValue)
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}

/*
    1. ArrayList 만든다.
    2. my_string 한 글자씩 돌면서 숫자이면 List에 넣는다.
    3. List sort
    4. List -> int[]
 */

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        String my_string = "hi12392";
        System.out.println(Arrays.toString(sol.solution(my_string)));
    }
}
