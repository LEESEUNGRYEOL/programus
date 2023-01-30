package src.lv0.q120834;

class Solution {
    public String solution(int age) {

        String tmp = "";
        while(age>0){
            tmp +=(char)(age%10+97);
            age /=10;
        }
        StringBuilder sb = new StringBuilder(tmp);
        return sb.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(23));
    }

}
