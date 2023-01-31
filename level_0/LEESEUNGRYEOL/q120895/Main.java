package level_0.LEESEUNGRYEOL.q120895;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "I love you";
        int num1 = 3, num2 = 6;
        String answer = sol.solution(my_string,num1,num2);
        System.out.println(answer);
    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char tmp,tmp2;
        StringBuilder sb = new StringBuilder();

        sb.append(my_string);
        System.out.println("sb = " + sb);
//        for (int i = 0; i < sb.length(); i++) {
//            System.out.println("i = " + sb.charAt(i));
//        }

        tmp = sb.charAt(num1);
        tmp2 = sb.charAt(num2);

        System.out.println("tmp = " + tmp);
        sb.deleteCharAt(num1);
        sb.insert(num1,tmp2);
        System.out.println("sb = " + sb);
        sb.deleteCharAt(num2);
        sb.insert(num2,tmp);
        System.out.println("sb = " + sb);
        answer = sb.toString();
        return answer;
    }
}