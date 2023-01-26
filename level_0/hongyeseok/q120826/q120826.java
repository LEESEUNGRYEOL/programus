package level_0.hongyeseok.q120826;


/**
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 입출력
 * my_string	letter	result
 * "abcdef"	    "f" 	"abcde"
 * "BCBdbe"	    "B"	    "Cdbe"
 */
public class q120826 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        System.out.println(Solution.solution(my_string,"f"));
    }
}
class Solution {
    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}