package level_0.doyeonKim.q120585;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        Arrays.sort(array);
        int answer = (array.length - 1) - lower_bound(array, 0, array.length - 1, height); // array 마지막 인덱스 - lower_bound 인덱스
        System.out.println(answer);
        return answer;
    }

    // arr[L...R] 에서 X 이하의 수 중 제일 오르쪽 인덱스 return
    // X 이하의 수가 없으면 -1을 return
    int lower_bound(int[] arr, int L, int R, int X) {
        int result = -1; // X 이상의 수가 없으면 -1 return
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] <= X) {
                result = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        System.out.println(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(sol.solution(array, height));
    }
}
