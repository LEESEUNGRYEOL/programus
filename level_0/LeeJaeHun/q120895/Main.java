package src.lv0.q120895;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length() ; i++) {
            if (i == num1) {
                sb.append(my_string.charAt(num2));
            }else if (i == num2){
                sb.append(my_string.charAt(num1));
            }else{
                sb.append(my_string.charAt(i));
            }

        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 =1;
        int num2 =2;

        Solution solution = new Solution();
        System.out.println(solution.solution(my_string,num1,num2));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
