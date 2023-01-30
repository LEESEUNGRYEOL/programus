import java.util.LinkedList;
class Solution {
    public static LinkedList<Integer> solution(int[] numbers, String direction) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        if (direction.charAt(0) == 'r') {
            list.addFirst(list.pollLast());
        }
        else list.addLast(list.pollFirst());
        return list;
    }
}