package level_0.doyeonKim.q120904;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int num, int k) {
        List<Integer> list = new ArrayList<>();
        String[] str = String.valueOf(num).split("");
        for (String s : str) {
            list.add(Integer.parseInt(s));
        }

        return list.contains(k) ? list.indexOf(k) + 1 : -1;
    }
}


// 첫번째 풀이를 굳이 괜히 List로 바꿔서 풀었다.
// String에서도 indexOf 사용 가능하며, indexOf 해당 값이 없을 경우 알아서 -1을 리턴한다.
class Solution1 {
    public int solution(int num ,int k) {
        String str = String.valueOf(num);
        int index = str.indexOf(String.valueOf(k));
        return index != -1 ? index + 1 : index;
    }
}

/*
    num 숫자 하나씩 List에 넣는다.
    List에서 k를 포함하면 해당 인덱스 리턴(indexOf)
 */

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        int num = 29183;
        int k = 1;
        int num2 = 123456;
        int k2 = 7;
        System.out.println(sol.solution(num, k));
        System.out.println(sol.solution(num2, k2));
    }
}
