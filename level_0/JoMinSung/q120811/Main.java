package level_0.JoMinSung.q120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 2, 7, 10, 11, 12};
        int ans;
        ans = sol.solution(array);
        System.out.println(ans);

        /*
        int answer = sol.solution(array);
        System.out.println(answer.length);
        */

    }
}

class Solution {
     int solution(int[] array) {
        int[] answer = array;

        Arrays.sort(answer); // 일단 보기 좋은것도 있고 찾기 쉽게 오름차순으로 바꿔줌
        for (int i = 0; i < answer.length;){
            if(answer.length % 2 !=0);
               return answer[answer.length/2];
               //배열이 홀수일때 중앙값 구하는거
        }
        return (answer[answer.length / 2 - 1] + answer[answer.length / 2])/2;
        //배열이 짝수일때 중앙값 두개를 더해서 나누기2해서 평균값을 구함
         //실행 해보니 여기까지 배열이 안옵니다. 이건 실질적으로 없는 코드나 마찬가지 입니다.
    }
}

/*Arrays.sort(array); //일단은 배열을 오름차순으로 만들기 위해 사용

        return (array[array.length / 2]); // array의 배열값을 가져와서 거기에 나누기2를 하면 중간값이 나와서
    }
}*/
