/*
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
1 ≤ numbers의 길이 ≤ 1,000
입출력 예
numbers	                    result
[1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
 */

class solution120809 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
//    public ArrayList<Integer> solution(int[] numbers) {
//        List<Integer> answer = new ArrayList<>();
//        for (int x : numbers) {
//            answer.add(x*2);
//        }
//        return answer;
//    }
}

/*
배열 요소의 크기를 배수로 키워서 반환하는 문제이다
위의 방법처럼 각 요소 하나하나를 i로 접근해서 곱한값을 반환하거나
밑의 방법처럼 List로 바꿔서 계산하는 방법 두가지중 하나를 선택해서 사용하면 될것같다.
 */