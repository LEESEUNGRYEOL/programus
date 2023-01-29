class Solution {
    public static StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            c= (char) ((c>='a'&&c<='z')?c-32:c+32);
            answer.append(c);
        }
        return answer;
    }
}