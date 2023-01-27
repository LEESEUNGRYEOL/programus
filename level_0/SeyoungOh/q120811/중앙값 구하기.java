import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);
        answer = list.get(list.size() / 2);
        return answer;
    }
}