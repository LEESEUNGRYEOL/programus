package level_0.LEESEUNGRYEOL.q120849;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = new String("nice to meet you");
        String answer = sol.solution(my_string);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] arr = new char[]{'a', 'e', 'o', 'u', 'i'};
        int cnt = 0;
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (my_string.charAt(i) == arr[j]) {
                    cnt++;
                }
            }
            if (cnt != 1) {
                answer += my_string.charAt(i);
            }
//            System.out.println("answer = " + answer);
//            System.out.println("cnt = " + cnt);
            cnt = 0;
        }
        return answer;
    }
}