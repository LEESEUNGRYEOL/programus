package level_0.hongyeseok.q120851;

/**
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
 *
 * 입출력 예
 * my_string	    result
 * "aAb1B2cC34oOp"	10
 * "1a2b3c4d123"	16
 */
public class q120851 {
    public static void main(String[] args) {
        String s = "aAb1B2cC34oOpdagsa2552SDAF";
        System.out.println(Solution.solution(s));

    }
}

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] s = my_string.split("");
        for (int i = 0; i < s.length; i++) {
            answer += Integer.parseInt(s[i]);
        }
        return answer;
    }

}