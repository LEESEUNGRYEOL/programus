class Solution {
    public int solution(String my_string) {
     int answer = 0;
        int i;
        int n = 0;
        my_string = my_string.replaceAll("[^0-9]", "");

        for (i = 0; i < my_string.length(); i++) {
            n = my_string.charAt(i);
            answer += n - '0';
        }
        return answer;
    } 
}