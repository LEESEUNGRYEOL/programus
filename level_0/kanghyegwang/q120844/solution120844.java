package level_0.kanghyegwang.q120844;

/*
배열 회전시키기
문제 설명
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.
입출력 예
numbers	                    direction	result
[1, 2, 3]	                "right"	    [3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	    [455, 6, 4, -1, 45, 6, 4]
입출력 예 설명
입출력 예 #1

numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.
입출력 예 #2

numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.
 */

import java.util.*;
import java.util.stream.Collectors;

public class solution120844 {
    public int[] solution(int[] numbers, String direction) {
        // 추가하고 밀기 쉬운 List생성
        ArrayList<Integer> list = new ArrayList<>();
        // list에 numbers값 대입
        for (int x : numbers) {
            list.add(x);
        }
        // 결과 배열 길이 지정
        int[] answer = new int[numbers.length];
        // left인지 right인지 확인
        if (direction.equals("right")) {
            // right면 list의 0번쨰에 list의 마지막 값 대입 하면서 마지막 값은 삭제
            list.add(0, list.remove(list.size()-1));
        } else {
            // left면 list의 끝에 list의 첫번째 값 대입 하면서 첫번쨰 값 삭제
            list.add(list.remove(0));
        }
        // 결과배열에 list값 대입
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] n, String d) {
        // 위의 풀이 스트림을 이용
        List<Integer> list = Arrays.stream(n).boxed().collect(Collectors.toList());
        if(d.equals("right")) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
