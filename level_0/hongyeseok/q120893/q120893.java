package level_0.hongyeseok.q120893;

/**
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
 *
 * 입출력 예
 * my_string	result
 * "cccCCC"	    "CCCccc"
 * "abCdEfghIJ"	"ABcDeFGHij"
 */
public class q120893 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(Solution.solution(my_string));
    }
}

class Solution {
    public static String solution(String my_string) {
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for (int i = 0; i < my_string.length(); i++) {
            ch = my_string.charAt(i);
            if(ch >= 65 && ch <= 90){
                stringBuilder.append((char)(ch + 32));
            } else if (ch >= 97 && ch <= 122){
                stringBuilder.append((char) (ch - 32));
            }
        }
        return stringBuilder.toString();
    }
}