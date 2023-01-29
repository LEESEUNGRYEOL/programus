package level_0.kanghyegwang.q120850;

/*
문자열 정렬하기 (1)
문제 설명
문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

제한사항
1 ≤ my_string의 길이 ≤ 100
my_string에는 숫자가 한 개 이상 포함되어 있습니다.
my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. - - -
입출력 예
my_string	result
"hi12392"	[1, 2, 2, 3, 9]
"p2o4i8gj2"	[2, 2, 4, 8]
"abcde0"	[0]
입출력 예 설명
입출력 예 #1

"hi12392"에 있는 숫자 1, 2, 3, 9, 2를 오름차순 정렬한 [1, 2, 2, 3, 9]를 return 합니다.
입출력 예 #2

"p2o4i8gj2"에 있는 숫자 2, 4, 8, 2를 오름차순 정렬한 [2, 2, 4, 8]을 return 합니다.
입출력 예 #3

"abcde0"에 있는 숫자 0을 오름차순 정렬한 [0]을 return 합니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution120850 {
    public int[] solution(String s) {
        // 스트림을 이용한 풀이
        // s.replaceAll 을 사용한 정규식으로 문자열에 대소문자 제거
        // split을 사용해서 배열로 변환
        // sorted로 정렬 후 mapToTin로 stream을 Integer로 형변환
        // toArray()로 배열로 변환 
        // 최종적으로 int[] 값으로 리턴
        return Arrays.stream(s.replaceAll("[A-Z|a-z]", "")
                        .split("")).sorted()
                .mapToInt(Integer::parseInt).toArray();
    }

    public int[] solution2(String s) {
        // 숫자만 받을 List생성
        List<Integer> res = new ArrayList<>();
        // for문으로 s의 각 문자를 숫자인지 판별
        for (int i = 0; i < s.length(); i++) {
            // isDigit == 숫자면 true
            // charAt은 char로 받아오기 때문에 -48 아스키코드값을 빼줘야함 
            if (Character.isDigit(s.charAt(i))) res.add(s.charAt(i) - 48);
        }
        // List이기 때문에 Collections.sort로 정렬 Arrays.sort는 기본형만
        Collections.sort(res);
        // List의 크기로 정답 배열의 크기 지정
        int[] answer = new int[res.size()];
        // 정답배열에 순서대로 list의 값 대입
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }
        return answer;
    }
}
