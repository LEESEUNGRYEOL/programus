class Solution {
    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();
        while (age > 0) {
            char c = (char) (age % 10);
            c += 97;
            answer.append(c);
            age/=10;
        }
        return answer.reverse().toString();
    }
}