package level_0.kanghyegwang.q120909;

/*
문제 설명
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 1,000,000
입출력 예
n	    result
144	    1
976	    2
입출력 예 설명
입출력 예 #1

144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
입출력 예 #2

976은 제곱수가 아닙니다. 따라서 2를 return합니다
 */

public class solution120909 {
    public int solution(int n) {
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }

    public int solution2(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}

/*
주어진 숫자가 제곱근인지 아닌지 판별하는 문제이다
Math.sqrt를 사용하여 주어진 숫자의 제곱근을 구할 수 있고
Math.sqrt를 계산한 값을 1로 나눈 나머지가 0 이면 n은 제곱수인 것이고
0이 아니면 제곱수가 아닌 것이다

밑의 솔루션 2번은 n을 Math.sqrt로 나눈 나머지가 0이면 제곱수인 것이고 아니면 제곱수가 아닌것이다.
위의 방법보다 밑의 방법이 좋다고 생각하고 그 이유는 위의 방법은 Math.sqrt 로 나온 값을 1로 계속 나눠서 나머지 값을 확인해야 되지만
밑의 방법은 n을 Math.sqrt로 나눈 나머지 값을 게산하니 속도가 조금 더 빠를 것이라 생각한다
 */