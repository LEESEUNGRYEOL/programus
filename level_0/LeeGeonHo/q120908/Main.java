package level_0.LeeGeonHo.q120908;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(sol.solution(str1,str2));
    }
}

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer=1;
        }else{
            answer=2;
        }

        return answer;
    }
}