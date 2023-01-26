class Solution {
    public int solution(int n) {
        int mod = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            mod += str.charAt(i) - '0';

        }
        int answer = mod;
        return answer;
    }
}
