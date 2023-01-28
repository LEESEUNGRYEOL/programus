package level_0.hongyeseok.q120818;

/**
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * <p>
 * 입출력
 * price	result
 * 150,000	142,500
 * 580,000	464,000
 */
public class q120818 {
    public static void main(String[] args) {
        int price = 150000;
        System.out.println(Solution.solution(price));
    }
}

class Solution {
    public static int solution(int price) {
        if (price >= 500000) {
            price = (int) (price * 0.8);
        } else if (price >= 300000) {
            price = (int) (price * 0.9);
        } else if (price >= 100000) {
            price = (int) (price * 0.95);
        }
        return price;
    }
}