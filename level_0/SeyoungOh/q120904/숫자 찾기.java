import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public static int solution(int num, int k) {
        List<Integer> list = new ArrayList<>();
        int answer =-1;
        while (num>0) {
            list.add(num % 10);
            num/=10;
        }

        System.out.println(list);
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) == k) {
                answer = list.size() - i;
            }
        }
        return answer;
    }
}