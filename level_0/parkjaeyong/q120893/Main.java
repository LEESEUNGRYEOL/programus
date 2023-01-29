package level_0.parkjaeyong.q120893;


class Solution {
    public String solution(String my_string) {
        char[] ch  = my_string.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] <= 'Z') ch[i] += 32;
            else ch[i] -= 32;
        }
        return new String(ch);
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("abCdEfghIJ");
        System.out.println(ans);
    }
}

