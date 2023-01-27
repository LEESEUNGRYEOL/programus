package level_0.doyeonKim.q120906;

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;  // 10으로 나눈 나머지 -> 1의 자리수
            n /= 10;    // n을 10으로 나누면 원래 1의 자리는 없어지고 10의 자리가 1의 자리가 된다.
        }
        return answer;
    }
}

// stream 사용
// 1. String.valueOf(n).split("") -> int n을 String으로 바꾸고 split("")으로 한 문자씩 String 배열에 넣는다.
// 2. Arrays.stream( ~ ) -> 1에서 String 배열로 만들었던 것을 stream으로 만든다.
// 3. mapToInt(Integer::parseInt) -> 현재 스트림은 문자값을 가지므로, Integer 값으로 모두 바꿔준다.
// 4. sum() -> 스트림 안에 있는 값들을 모두 더한다.
class Solution1 {
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}

/*
    1번 방법. 10으로 나누고 나머지를 더하고를 반복한다.
    2번 방법. 정수를 한 글자씩 분리하고, 각 글자를 숫자로 변경하여 더한다.
 */

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
        Solution1 sol = new Solution1();
        int n1 = 1234;
        int n2 = 930211;
        System.out.println(sol.solution(n1));
        System.out.println(sol.solution(n2));
    }
}
