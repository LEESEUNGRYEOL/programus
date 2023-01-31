package level_0.LEESEUNGRYEOL.q120834;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int age =100;

        String answer = sol.solution(age);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        while(age > 0)
        {
            char i = (char) (age % 10 + 97);
            age /= 10;
            sb.insert(0,i);
        }
//        System.out.println("sb = " + sb);
        answer = sb.toString();
        return answer;
    }
}