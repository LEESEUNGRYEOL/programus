package level_0.kanghyegwang.q120899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class solution120899 {
    public int[] solution(int[] n) {
        // 정답 배열 지정 최대값과 그 값의 인덱스 값만 들어가서 2로 길이 지정
        int[] res = new int[2];
        // max값과 인덱스 값을 위한 변수 지정
        int max = Integer.MIN_VALUE, idx = 0;
        // n배열의 길이만큼 반복
        for (int i = 0; i < n.length; i++) {
            // n의 각 요소가 max보다 큰지 확인
            if (n[i] > max) {
                // n의 요소가 max보다 크면 max값을 n의 요소값으로 변경
                max = n[i];
                // max가 변경될때마다 idx에 i값 변경
                idx = i;
            }
        }
        res[0] = max;
        res[1] = idx;
        return res;
    }

    public int[] solution2(int[] n) {
        int[] res = new int[2];
        // 스트림으로 풀이 리스트 생성시 stream으로 n을 받아서 boxed로 형변환 후 list로 변환에서 list에 주입
        List<Integer> list = Arrays.stream(n).boxed().collect(Collectors.toList());
        // list의 가장 큰값을 get으로 반환
        res[0] = list.stream().max(Comparator.naturalOrder()).get();
        // indexOf로 res[0]에 있는 최댓값의 인덱스 반환
        res[1] = list.indexOf(res[0]);
        return res;
    }
}
