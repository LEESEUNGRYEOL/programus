package src.lv0.q120897;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {

        return IntStream.rangeClosed(1,n).filter(i->n%i==0).toArray();
    }


    public int[] solution2(int n) {
        int[] answer= {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);

        }

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {
        int n = 24;
        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
        System.out.println(Arrays.toString(solution.solution2(n)));
    }

}
