import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = (int)Math.sqrt(n);
        int b = (int)Math.pow(a,2);
        if(n==b) answer = 1;
        else answer =2;
        return answer;
    }
}