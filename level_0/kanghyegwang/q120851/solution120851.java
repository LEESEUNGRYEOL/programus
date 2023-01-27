package level_0.kanghyegwang.q120851;

/*
숨어있는 숫자의 덧셈 (1)
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
입출력 예
my_string	result
"aAb1B2cC34oOp"	10
"1a2b3c4d123"	16
입출력 예 설명
입출력 예 #1

"aAb1B2cC34oOp"안의 한자리 자연수는 1, 2, 3, 4 입니다. 따라서 1 + 2 + 3 + 4 = 10 을 return합니다.
입출력 예 #2

"1a2b3c4d123Z"안의 한자리 자연수는 1, 2, 3, 4, 1, 2, 3 입니다. 따라서 1 + 2 + 3 + 4 + 1 + 2 + 3 = 16 을 return합니다.
유의사항
연속된 숫자도 각각 한 자리 숫자로 취급합니다.
 */

import java.util.Scanner;

class solution120851 {
    public int solution(String s) {
        int res = 0;
        char[] a = s.toCharArray();
        for (char x : a) {
            if (Character.isDigit(x)) res += Character.getNumericValue(x);;
        }
        return res;
    }

    public static void main(String[] args) {
        solution120851 T = new solution120851();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.println(T.solution(a));
    }
}

/*
주어진 문자열 속에 숫자만을 추출해서 더하는 문제이다
문자열을 문자배열로 만들고 그 문자배열의 각 요소를 숫자인지 검사해서 더하면 풀수있다.
 */