package level_0.LeeGeonHo.q120889;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] sides	= {199, 72, 222};
        System.out.println(sol.solution(sides));
    }
}

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[2] < (sides[0]+sides[1])){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}