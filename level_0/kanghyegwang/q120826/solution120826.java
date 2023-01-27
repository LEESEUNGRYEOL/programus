/*
문제 설명
문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
letter은 길이가 1인 영문자입니다.
my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
대문자와 소문자를 구분합니다.
입출력 예
my_string	letter	result
"abcdef"	"f"	    "abcde"
"BCBdbe"	"B"	    "Cdbe"
 */

class solution120826 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}

/*
문자열의 제거를 물어보는 문제이다
String클래스에느 제거하는 함수는 없기에 replace함수를 사용해서 letter문자열을 "" 빈 문자열로 바꾸어서 반환한다.
 */