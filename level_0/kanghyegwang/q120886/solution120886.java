package level_0.kanghyegwang.q120886;

/*
A로 B 만들기
문제 설명
문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < before의 길이 == after의 길이 < 1,000
before와 after는 모두 소문자로 이루어져 있습니다.
입출력 예
before	after	result
"olleh"	"hello"	1
"allpe"	"apple"	0
입출력 예 설명
입출력 예 #1

"olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
입출력 예 #2

"allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
 */

import java.util.Arrays;

public class solution120886 {
    public int solution(String b, String a) {
        // 문자열을 문자배열로 변환
        char[] c1 = b.toCharArray();
        char[] c2 = a.toCharArray();
        // 문자 배열을 정렬
        Arrays.sort(c1);
        Arrays.sort(c2);
        // String으로 변환해서 같은 문자면 1 아니면 0반환
        return new String(c1).equals(new String(c2)) ? 1 : 0;
    }
}
