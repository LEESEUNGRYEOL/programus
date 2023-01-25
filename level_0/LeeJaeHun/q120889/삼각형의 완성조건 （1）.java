
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        answer = sides[0]+sides[1] <= sides[2]?2:1;
        return answer;
    }
}