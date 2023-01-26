package level_0.KimNahyun.q120811;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int len = array.length/2;
        Arrays.sort(array);

        return array[len];
    }
}

// Arrays.sort()로 오름차순 정렬 후 배열의 길이를 반으로 나눠서 중앙값을 찾았다.