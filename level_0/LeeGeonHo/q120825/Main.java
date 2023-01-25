package level_0.LeeGeonHo.q120825;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello";
        int n =3;
        System.out.println(sol.solution(my_string,n));
    }
}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < n; j++) {
                answer +=str[i];
            }
        }
        return answer;
    }
}
