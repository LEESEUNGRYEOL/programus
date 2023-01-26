import java.util.Arrays;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str:s1) {
            answer += Arrays.stream(s2).filter(s->s.equals(str)).count();
        }
        return answer;
    }
}