package level_0.LEESEUNGRYEOL.q120908;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = new String("abcde");
        String str2 = new String("ab");
        int answer = sol.solution(str1,str2);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String str1, String str2) {
        if(str1.contains(str2)){
            return 1;
        }
        else{
            return 2;
        }
    }
}