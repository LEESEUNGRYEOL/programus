package src.lv0.q120893;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))){
                answer+=String.valueOf( my_string.charAt(i)).toLowerCase();
            }else{
                answer+=String.valueOf( my_string.charAt(i)).toUpperCase();
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        Solution solution = new Solution();
        System.out.println(solution.solution(my_string));
//        System.out.println(Arrays.toString(solution.solution(n)));
    }

}
