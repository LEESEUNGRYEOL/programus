package level_0.doyeonKim.q120895;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String[] str = my_string.split("");

        for (int i = 0; i < str.length; i++) {
            if (i == num1) {
                sb.append(str[num2]);
            }
            else if (i == num2) {
                sb.append(str[num1]);
            } else {
                sb.append(str[i]);
            }
        }

        return sb.toString();
    }
}

/*
    my_string을 split("")으로 한 글자씩 스트링 배열에 넣는다.
    한 글자씩 sb에 넣어주면서 인덱스가 num1 일 떈 [num2]의 값을,
    인덱스가 num2 일 땐 [num1]의 값을 sb에 넣는다.
 */

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(sol.solution(my_string, num1, num2));
    }
}
