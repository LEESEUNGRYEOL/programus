import java.util.Arrays;

class Solution {
    public static String solution(String my_string) {
        String[] answer = my_string.toLowerCase().split("");
        Arrays.sort(answer);
        StringBuilder answer2 = new StringBuilder();
        for (int i = 0; i < answer.length; i++) {
            answer2.append(answer[i]);
        }
        return answer2.toString();
    }
}