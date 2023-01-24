import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int idx = 0;
        for (int i = 0; i < sides.length; i++) {
            if(sides[i]>max) {
                max = sides[i];
                idx= i;
            }
        }
        for (int i = 0; i < sides.length; i++) {
            if (i!=idx) {
                answer += sides[i];
            }
        }
        if (answer > max) answer=1;
        else answer=2;
        return answer;
    }
}