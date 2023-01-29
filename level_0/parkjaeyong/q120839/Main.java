package level_0.parkjaeyong.q120839;


class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char a : arr)
            sb.append(a == '2' ? '0' : a=='0' ? '5' : '2');
        return sb.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String ans = sol.solution("205");
        System.out.println(ans);
    }
}

