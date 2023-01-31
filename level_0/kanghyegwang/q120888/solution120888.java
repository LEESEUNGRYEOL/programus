package level_0.kanghyegwang.q120888;

/*
중복된 문자 제거
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string ≤ 110
my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
대문자와 소문자를 구분합니다.
공백(" ")도 하나의 문자로 구분합니다.
중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
입출력 예
my_string	            result
"people"	            "peol"
"We are the world"	    "We arthwold"
입출력 예 설명
입출력 예 #1

"people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 return합니다.
입출력 예 #2

"We are the world"에서 중복된 문자 "e", " ", "r" 들을 제거한 "We arthwold"을 return합니다.
 */

public class solution120888 {
    public String solution(String s) {
        // 계속 추가할 거니 StringBuilder로 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // indexOf로 찾은 문자의 인덱스가 i값이랑 같으면 추가
            if (s.indexOf(s.charAt(i)) == i) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
