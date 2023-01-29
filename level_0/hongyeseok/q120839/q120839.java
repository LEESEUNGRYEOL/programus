package level_0.hongyeseok.q120839;

/**
 * 문제 설명
 * 가위는 2 바위는 0 보는 5로 표현합니다.
 * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < rsp의 길이 ≤ 100
 * rsp와 길이가 같은 문자열을 return 합니다.
 * rsp는 숫자 0, 2, 5로 이루어져 있습니다.
 *
 * 입출력 예
 * rsp	        result
 * "2"	        "0"
 * "205"	    "052"
 */
public class q120839 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(Solution.solution(rsp));


    }
}

class Solution {
    public static String solution(String rsp) {
        //0은 2를 이긴다 2는 5를 이긴다 5는 0을 이긴다
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        for (int i = 0; i < rsp.length(); i++) {
            ch = rsp.charAt(i);
            if(ch == '2'){
                stringBuilder.append("0");
            } else if(ch == '0'){
                stringBuilder.append("5");
            } else if (ch == '5'){
                stringBuilder.append("2");
            }
        }
        return stringBuilder.toString();
    }
}