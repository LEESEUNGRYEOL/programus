package level_0.parkjaeyong.q120825;


import java.io.BufferedOutputStream;
import java.io.Console;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < my_string.length(); i++)
            for(int j = 0 ; j < n ; j++)
                sb.append(my_string.charAt(i));
        return sb.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("hello", 3);
        System.out.println(ans);
    }
}

