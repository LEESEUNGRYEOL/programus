package q120811;

import java.util.Arrays;
//중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
//예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
//정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int answer = sol.solution(array);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array); // 오름차순 정렬
        for (int i = 0; i <= array.length; i++) {
            if (array.length % 2 != 0)
                return array[array.length / 2];
        }
  return answer;
    }
}