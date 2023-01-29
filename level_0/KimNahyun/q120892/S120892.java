package level_0.KimNahyun.q120892;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr = cipher.split("");

        for (int i = code; i <= cipher.length(); i+=code) {
            answer += arr[i-1];
        }

        return answer;
    }
}