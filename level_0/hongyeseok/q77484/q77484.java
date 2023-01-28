package level_0.hongyeseok.q77484;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 순위	당첨 내용
 * 1	6개 번호가 모두 일치
 * 2	5개 번호가 일치
 * 3	4개 번호가 일치
 * 4	3개 번호가 일치
 * 5	2개 번호가 일치
 * 6(낙첨)	그 외
 * <p>
 * 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * 제한사항
 * lottos는 길이 6인 정수 배열입니다.
 * lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
 * 0은 알아볼 수 없는 숫자를 의미합니다.
 * 0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
 * lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
 * win_nums은 길이 6인 정수 배열입니다.
 * win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
 * win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
 * win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.
 * <p>
 * 입출력 예
 * lottos	                win_nums	                result
 * [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
 * [0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]	[1, 6]
 * [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]
 */
public class q77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] asd = Solution.solution(lottos, win_nums);
        for (int i = 0; i < 2; i++) {
            System.out.println(asd[i]);
        }
    }
}

class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> lottoList = IntStream.of(lottos).boxed().collect(Collectors.toList());
        List<Integer> winNumList = IntStream.of(win_nums).boxed().collect(Collectors.toList());
        int[] answer = new int[2];
        int matchNumber = 0;
        int zeroNumber = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (winNumList.contains(lottoList.get(i))) {
                matchNumber++;
            }
            if (lottoList.get(i) == 0) {
                zeroNumber++;
            }
        }
        answer[1] = 7 - matchNumber;
        answer[0] = 7 - (matchNumber + zeroNumber);
        if (answer[1] >= 6) {
            answer[1] = 6;
        }
        if(answer[0] >= 6){
            answer[0] = 6;
        }
        return answer;
    }
}