package level_0.hongyeseok.q120822;

/**
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 * <p>
 * 입출력
 * <p>
 * my_string	return
 * "jaron"	    "noraj"
 * "bread"	    "daerb"
 */
public class q120822 {
    public static void main(String[] args) {
        String name = "jaron";
        System.out.println(Solution.solution(name));

    }
}

class Solution {
    public static String solution(String my_string) {
        String answer = "";
        String[] temp = my_string.split("");

        for (int i = 0; i < temp.length; i++) {
            answer += temp[temp.length - i - 1];
        }

        return answer;
    }
}
