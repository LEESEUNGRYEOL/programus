package level_0.doyeonKim.q120844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for (int n : numbers)
            list.add(n);

        if (direction.equals("right"))
            list.add(0, list.remove(list.size() - 1));
        else
            list.add(list.remove(0));

        return list.stream().mapToInt(i -> i).toArray();
    }
}

/*
    1. numbers 배열을 list로 만든다.
    2. right 면, 마지막 인덱스 지워서(remove(int index)) 첫번째에 넣어준다(add(int index, E element)).
    3. left 면, 첫번째 인덱스 지워서(remove(int index)) 마지막에 넣는다(add).
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(sol.solution(numbers, direction)));
    }
}
