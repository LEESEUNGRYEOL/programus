package level_0.hongyeseok.q120833;

/**
 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
 * 입출력
 * numbers	            num1    	num2	    result
 * [1, 2, 3, 4, 5]	    1	        3	        [2, 3, 4]
 * [1, 3, 5]	        1	        2	        [3, 5]
 */
public class q120833 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] answer = Solution.solution(numbers,1,3);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}

class Solution {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1 + i];
        }
//        int[] numbersClone = numbers.clone();
//        System.out.println("numbersClone 배열 출력");
//        for(int i : numbersClone){
//            System.out.println(i);
//        }
//
//        // 0번부터 num2까지 복사, +1까지 해 줘야 한다.
//        int[] ans0 = Arrays.copyOf(numbers, num2+1);
//        System.out.println("ans0 배열 출력");
//        for(int i : ans0){
//            System.out.println(i);
//        }
//
//        //인덱스를 정해서 배열을 복사하는 데는 이 방법이 가장 많이 쓰일 것 같다.
//        int[] ans1 = Arrays.copyOfRange(numbers, num1, num2+1);
//        System.out.println("ans1 배열 출력");
//        for(int i : ans1){
//            System.out.println(i);
//        }
//
//        //이건 아마 잘 안쓸 듯 싶다.
//        int[] ans2 = new int[num2 - num1 + 1];
//        System.out.println("ans2 배열 출력");
//        System.arraycopy(numbers,num1,ans2,0,ans2.length);
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(ans2[i]);
//        }
        return answer;
    }
}