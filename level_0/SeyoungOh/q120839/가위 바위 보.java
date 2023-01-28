class Solution {
    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        char[] win = {'0', '2', '5'};
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if ('0' == c) {
                answer.append('5');
            } else if ('2' == c) {
                answer.append('0');
            } else answer.append('2');
        }
        return answer.toString();
    }
}