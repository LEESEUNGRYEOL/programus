package level_0.LEESEUNGRYEOL.q120822;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = new String("aaabbb");
//          String my_string = "jaron";
        String answer = sol.solution(my_string);
        System.out.println(answer);
    }
}

// 나의 풀이
class Solution {
    public String solution(String my_string) {
        char[] a = new char[my_string.length()];
        int cnt = 0;
        for (int i = my_string.length() - 1; i >= 0; i--) {
            a[cnt] = my_string.charAt(i);
            cnt++;
        }
        String answer = new String("");
        for (int i = 0 ;i < my_string.length(); i++) {
            answer = answer + a[i];
        }
        return answer;
    }
}

//// 나의 코드를 간단화 시킨 것
//class Solution {
//    public String solution(String my_string) {
//        String answer = "";
//
//        for(int i=my_string.length()-1; i>=0; i--){
//            answer+=my_string.charAt(i);
//        }
//
//        return answer;
//    }
//}