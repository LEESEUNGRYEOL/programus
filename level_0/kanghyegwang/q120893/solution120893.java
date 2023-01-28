package level_0.kanghyegwang.q120893;

/*
대문자와 소문자
문제 설명
문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
입출력 예
my_string	    result
"cccCCC"	    "CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"
입출력 예 설명
입출력 예 #1

소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다.
입출력 예 #2

소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
 */

import java.util.Scanner;

public class solution120893 {
    public String solution(String my_string) {
        String answer = "";
        for (char x : my_string.toCharArray()) {
            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution120893 T = new solution120893();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.println(T.solution(a));
    }
}

/*
문자열의 각 문자들의 대소문자를 바꿔주는 문제
각 문자를 대문자인지 소문자인지를 판별하고 대문자면 소문자로 소문자면 대문자로 바꿔주는 문제 
 */