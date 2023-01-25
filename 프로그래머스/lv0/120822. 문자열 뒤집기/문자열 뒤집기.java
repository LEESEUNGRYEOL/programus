import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        StringBuffer my_string_b = new StringBuffer(my_string);
        String answer = my_string_b.reverse().toString();

        return answer;
        //return new StringBuilder(myString).reverse().toString();
    }
}