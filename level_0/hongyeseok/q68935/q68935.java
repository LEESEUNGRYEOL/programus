package level_0.hongyeseok.q68935;

import java.util.ArrayList;
import java.util.List;

/**
 * 자연수 n이 매개변수로 주어집니다.
 * n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 *
 * 입출력 예
 * n	result
 * 45	7
 * 125	229
 * 입출력 예 #1
 *
 * 답을 도출하는 과정은 다음과 같습니다.
 * n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
 * 45	        1200	    0021	        7
 * 따라서 7을 return 해야 합니다.
 */
public class q68935 {
    public static void main(String[] args) {
        System.out.println(Solution.solution(45));

    }
}
class Solution {
    public static int solution(int n) {
        //0 1 2 10 11 12 20 21 22 100 101 102 110 111 112 120 121 122 200 201 202
        //0 1 2 3  4  5  6  7  8  9   10  11  12  13  14  15  16  17  18  19  20
        //3진법 202는 3의 2승이 2개 + 3의 1승이 0개 + 3의 0승이 2개 == 18 + 0 + 2 == 20
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n%3);
            n/=3;
        }
        for(int i = 0; i < list.size(); i++){
            answer += Math.pow(3,list.size()-1-i)*list.get(i);
        }
        return answer;
    }
}