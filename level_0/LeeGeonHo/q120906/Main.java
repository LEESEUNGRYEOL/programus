package level_0.LeeGeonHo.q120906;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int n = 1234;
        System.out.println(sol.solution1(n));
    }
}

class Solution {
    //스트림 이용한
    public int solution1(int n) {
        int answer=0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digits.length; i++) {
            answer +=digits[i];
        }
        return answer;
    }
}

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        while(n/10 !=0){
//            answer+= n%10;
//            n=n/10;
//        }
//        return answer+=n;
//    }
//}
