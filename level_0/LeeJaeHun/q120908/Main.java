package src.lv0.q120908;

class Solution {
    public int solution(String str1, String str2) {


        return str1.contains(str2)?1:2;
    }
}

public class Main {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        Solution solution = new Solution();
        System.out.println(solution.solution(str1,str2));
    }

}
