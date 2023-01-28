package level_0.hongyeseok.q120849;

/**
 * 문제 설명
 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한 사항
 * my_string은 소문자와 공백으로 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력
 * my_string	        result
 * "bus"	            "bs"
 * "nice to meet you"	"nc t mt y"
 */
public class q120849 {
    public static void main(String[] args) {
        System.out.println(Solution.solution("nice to meet you"));
    }
}

class Solution {
    public static String solution(String my_string) {
        String[] vowels = {"a","e","i","o","u"};
        for (int i = 0; i < vowels.length; i++) {
            my_string = my_string.replace(vowels[i],"");
        }
        return my_string;
    }
}